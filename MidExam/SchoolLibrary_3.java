package MidExam;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SchoolLibrary_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> namesList = Arrays
                .stream(scanner.nextLine().split("&"))
                .collect(Collectors.toList());

        String inputLine = scanner.nextLine();
        while (!inputLine.equals("Done")) {
            String[] commandArr = inputLine.split("\\s\\|\\s");
            String command = commandArr[0];
            String book = commandArr[1];

            switch (command) {
                case "Add Book":
                    if (!namesList.contains(book)) {
                        namesList.add(0, book);
                    }
                    break;
                case "Take Book":
                    if (namesList.contains(book)) {
                        namesList.remove(book);
                    }
                    break;
                case "Swap Books":
                    String newBook = commandArr[2];
                    if (namesList.contains(book) && namesList.contains(newBook)) {
                        int index1 = namesList.indexOf(book);
                        int index2 = namesList.indexOf(newBook);;
                        Collections.swap(namesList, index1, index2);
                    }
                    break;
                case "Insert Book":
                    if (!namesList.contains(book)) {
                        namesList.add(book);
                    }
                    break;
                case "Check Book":
                    int givenIndex = Integer.parseInt(inputLine.split(" | ")[1]);
                    if (givenIndex <= namesList.size()) {
                        String checkBook = namesList.get(givenIndex);
                        if (checkBook.equals(book)) {
                            System.out.println(book);
                        }
                    }
                    break;
            }

            inputLine = scanner.nextLine();
        }
        System.out.println(String.join(", ", namesList));
    }
}

