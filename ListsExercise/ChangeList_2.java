package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String inputLine = scanner.nextLine();
        while (!inputLine.equals("end")) {

            if (inputLine.contains("Delete")) {
                int numberToDelete = Integer.parseInt(inputLine.split(" ")[1]);
                numbersList.removeAll(Arrays.asList(numberToDelete));
            } else if (inputLine.contains("Insert")){
                int element = Integer.parseInt(inputLine.split(" ")[1]);
                int index = Integer.parseInt(inputLine.split(" ")[2]);
                numbersList.add(index, element);
            }
            inputLine = scanner.nextLine();
        }
        for (Integer i : numbersList) {
            System.out.print(i + " ");
        }
    }
}
