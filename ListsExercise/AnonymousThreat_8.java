package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnonymousThreat_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> namesList = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .collect(Collectors.toList());

        String inputLine = scanner.nextLine();
        while (!inputLine.equals("3:1")) {
            if (inputLine.contains("merge")) {
                int startIndex = Integer.parseInt(inputLine.split(" ")[1]);
                int endIndex = Integer.parseInt(inputLine.split(" ")[2]);

                if (startIndex < 0) {
                    startIndex = 0;
                }
                if (endIndex > namesList.size() - 1) {
                    endIndex = namesList.size() - 1;
                }
                boolean isValidIndex = startIndex <= namesList.size() - 1 && endIndex >= 0 && startIndex < endIndex;

                if (isValidIndex) {
                    String resultMerge = "";
                    for (int index = startIndex; index <= endIndex; index++) {
                        String currentText = namesList.get(index);
                        resultMerge += currentText;
                    }
                    for (int index = startIndex; index <= endIndex; index++) {
                        namesList.remove(startIndex);
                    }
                    namesList.add(startIndex, resultMerge);
                }
            } else if (inputLine.contains("divide")) {
                int index = Integer.parseInt(inputLine.split(" ")[1]);
                int parts = Integer.parseInt(inputLine.split(" ")[2]);

                String elementForDivision = namesList.get(index);
                namesList.remove(index);

                int partSize = elementForDivision.length() / parts;
                int beginingIndexOfList = 0;
                for (int part = 1; part < parts; part++) {
                    namesList.add(index, elementForDivision.substring(beginingIndexOfList, beginingIndexOfList + partSize));
                    index++;
                    beginingIndexOfList += partSize;
                }
                namesList.add(index, elementForDivision.substring(beginingIndexOfList));
            }
            inputLine = scanner.nextLine();
        }
        for (String text : namesList) {
            System.out.print(text + " ");
        }
    }
}
