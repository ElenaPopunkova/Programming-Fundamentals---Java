package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String inputLine = scanner.nextLine();
        while (!inputLine.equals("end")) {
            String[] commandArr = inputLine.split(" ");
            String command = commandArr[0];

            switch (command) {
                case "Contains":
                    int numToContain = Integer.parseInt(commandArr[1]);
                    if (numbersList.contains(numToContain)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    if (commandArr[1].equals("even")) {
                        for (int i = 0; i < numbersList.size(); i++) {
                            if (numbersList.get(i) % 2 == 0) {
                                System.out.print(numbersList.get(i) + " ");
                            }
                        }
                    } else if (commandArr[1].equals("odd")) {
                        for (int i = 0; i < numbersList.size(); i++) {
                            if (numbersList.get(i) % 2 != 0) {
                                System.out.print(numbersList.get(i) + " ");
                            }
                        }
                    }
                    System.out.println();
                    break;
                case "Get":
                    int sum = 0;
                    for (int num : numbersList) {
                        sum += num;
                    }
                    System.out.println(sum);
                    break;
                case "Filter":
                    StringBuilder filter = new StringBuilder();
                    int num = Integer.parseInt(commandArr[2]);
                    switch (commandArr[1]) {
                        case "<" -> {
                            for (Integer list : numbersList) {
                                if (list < num) {
                                    filter.append(list).append(" ");
                                }
                            }
                            System.out.println(filter);
                        }
                        case ">" -> {
                            for (Integer list : numbersList) {
                                if (list > num) {
                                    filter.append(list).append(" ");
                                }
                            }
                            System.out.println(filter);
                        }
                        case ">=" -> {
                            for (Integer list : numbersList) {
                                if (list >= num) {
                                    filter.append(list).append(" ");
                                }
                            }
                            System.out.println(filter);
                        }
                        case "<=" -> {
                            for (Integer list : numbersList) {
                                if (list <= num) {
                                    filter.append(list).append(" ");
                                }
                            }
                            System.out.println(filter);
                        }
                    }
                    break;
            }
            inputLine = scanner.nextLine();
        }
    }
}
