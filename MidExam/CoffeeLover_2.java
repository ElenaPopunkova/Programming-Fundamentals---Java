package MidExam;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CoffeeLover_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> namesList = Arrays
                .stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String inputLine = scanner.nextLine();
            String[] commandArr = inputLine.split(" ");
            String command = commandArr[0];

            switch (command) {
                case "Include":
                    namesList.add(commandArr[1]);
                    break;
                case "Remove":
                    int numberToRemove = Integer.parseInt(commandArr[2]);
                    if (numberToRemove <= namesList.size()) {
                        if (commandArr[1].equals("first")) {
                            namesList.subList(0, numberToRemove).clear();
                        } else if (commandArr[1].equals("last")) {
                            namesList.subList(namesList.size() - numberToRemove, namesList.size()).clear();
                        }
                    }
                    break;
                case "Prefer":
                    int index1 = Integer.parseInt(commandArr[1]);
                    int index2 = Integer.parseInt(commandArr[2]);

                    if (index1 >= 0 && index1 <= namesList.size() && index2 >= 0 && index2 <= namesList.size()) {
                        Collections.swap(namesList, index1, index2);
                    }
                    break;
                case "Reverse":
                    Collections.reverse(namesList);
                    break;
            }
        }
        System.out.println("Coffees:");
        System.out.println(String.join(" ", namesList));
    }
}
