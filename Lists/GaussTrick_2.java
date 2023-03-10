package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int size = numbersList.size();
        for (int i = 0; i < size / 2; i++) {
            int firstNum = numbersList.get(i);
            int secondNum = numbersList.get(numbersList.size() - 1);

            numbersList.set(i, firstNum + secondNum);
            numbersList.remove(numbersList.size() - 1);
        }
        for (int item : numbersList) {
            System.out.print(item + " ");
        }
    }
}
