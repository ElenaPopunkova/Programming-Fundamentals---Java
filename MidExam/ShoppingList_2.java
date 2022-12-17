package MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShoppingList_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> namesList = Arrays.stream(scanner.nextLine()
                        .split("!"))
                .collect(Collectors.toList());

        String inputLine = scanner.nextLine();
        while (!inputLine.equals("Go Shopping!")) {
            String[] commandArr = inputLine.split(" ");
            String command = commandArr[0];
            String item = commandArr[1];

            switch (command) {
                case "Urgent":
                    if (!namesList.contains(item)) {
                        namesList.add(0, item);
                    } else {
                        break;
                    }
                    break;
                case "Unnecessary":
                    if (namesList.contains(item)) {
                        namesList.remove(item);
                    } else {
                        break;
                    }
                    break;
                case "Correct":
                    String newItem = commandArr[2];
                    if (namesList.contains(item)) {
                        int indexOfItem = namesList.indexOf(item);
                        namesList.set(indexOfItem, newItem);
                    } else {
                        break;
                    }
                    break;
                case "Rearrange":
                    if (namesList.contains(item)) {
                        namesList.remove(item);
                        namesList.add(item);
                    } else {
                        break;
                    }
                    break;
            }
            inputLine = scanner.nextLine();
        }
        System.out.println(String.join(", ", namesList));
    }
}


