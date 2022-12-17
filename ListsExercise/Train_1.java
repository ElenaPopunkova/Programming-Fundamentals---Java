package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int maxCapacity = Integer.parseInt(scanner.nextLine());

        String inputLine = scanner.nextLine();
        while (!inputLine.equals("end")) {
            String[] commandArr = inputLine.split("\\s+");

            if (inputLine.contains("Add")) {
                int numToAdd = Integer.parseInt(commandArr[1]);
                numbersList.add(numToAdd);
            } else {
                int passengerHeadCount = Integer.parseInt(commandArr[0]);
                for (int wagon = 0; wagon < numbersList.size(); wagon++) {
                    int passangersToAdd = numbersList.get(wagon) + passengerHeadCount;
                    if (passangersToAdd <= maxCapacity) {
                        numbersList.remove(wagon);
                        numbersList.add(wagon, passangersToAdd);
                        break;
                    }
                }
            }
            inputLine = scanner.nextLine();
        }
        for (Integer i : numbersList) {
            System.out.print(i + " ");
        }
    }
}
