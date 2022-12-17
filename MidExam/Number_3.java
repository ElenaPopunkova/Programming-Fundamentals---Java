package MidExam;

import java.util.*;
import java.util.stream.Collectors;

public class Number_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Collections.sort(numbersList, Collections.reverseOrder());

        List<Integer> topNumList = new ArrayList<>();

        double averageNum = getAverageNum(numbersList);

        for (int i = 0; i < numbersList.size(); i++) {
            if (numbersList.get(i) > averageNum) {
                if (topNumList.size() <= 4) {
                    topNumList.add(numbersList.get(i));
                }
            }
        }

        if (!topNumList.isEmpty()) {
            for (Integer num : topNumList) {
                System.out.print(num + " ");
            }
        } else {
            System.out.println("No");
        }

    }
    private static double getAverageNum (List<Integer> numbersList) {
        double averageNum = numbersList.stream().mapToInt(Integer::intValue).sum();
        return averageNum / numbersList.size();
    }
}
