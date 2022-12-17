package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String inputLine = scanner.nextLine();
        while (!inputLine.equals("End")) {
            if (inputLine.contains("Add")) {
                int numberToAdd = Integer.parseInt(inputLine.split("\\s+")[1]);
                numbersList.add(numberToAdd);

            } else if (inputLine.contains("Insert")) {
                int numberToInsert = Integer.parseInt(inputLine.split("\\s+")[1]);
                int index = Integer.parseInt(inputLine.split("\\s+")[2]);

                if (isValidIndex(index, numbersList)) {
                    numbersList.add(index, numberToInsert);
                } else {
                    System.out.println("Invalid index");
                }
            } else if (inputLine.contains("Remove")) {
                int numberToRemove = Integer.parseInt(inputLine.split("\\s+")[1]);

                if (isValidIndex(numberToRemove, numbersList)) {
                    numbersList.remove(numberToRemove);
                } else {
                    System.out.println("Invalid index");
                }
            } else if (inputLine.contains("Shift left")) {
                int countShiftLeft = Integer.parseInt(inputLine.split("\\s+")[2]);
                for (int times = 1; times <= countShiftLeft; times++) {
                    int firstNumber = numbersList.get(0);
                    numbersList.remove(0);
                    numbersList.add(firstNumber);
                }
            } else if (inputLine.contains("Shift right")) {
                int countShiftRight = Integer.parseInt(inputLine.split("\\s+")[2]);
                for (int times = 1; times <= countShiftRight; times++) {
                    int lastNumber = numbersList.get(numbersList.size() - 1);
                    numbersList.remove(numbersList.size() - 1);
                    numbersList.add(0, lastNumber);
                }
            }
            inputLine = scanner.nextLine();
        }
        for (Integer i : numbersList) {
            System.out.print(i + " ");
        }
    }
    public static boolean isValidIndex (int index, List<Integer> numbers) {
        return index >= 0 && index <= numbers.size() - 1;
    }
}
