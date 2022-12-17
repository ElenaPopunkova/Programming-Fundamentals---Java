package ListsExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> namesList = new ArrayList<>();
        int commandNum = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < commandNum; i++) {
            String inputLine = scanner.nextLine();
            String[] commandArr = inputLine.split("\\s+");

            if (inputLine.contains("is going!")) {
                String name = commandArr[0];
                if (namesList.contains(name)) {
                    System.out.printf("%s is already in the list!\n", name);
                } else {
                    namesList.add(name);
                }
            } else if (inputLine.contains("is not going!")) {
                String name = commandArr[0];
                if (namesList.contains(name)) {
                    namesList.remove(name);
                } else {
                    System.out.printf("%s is not in the list!\n", name);
                }
            }
        }
        for (String names : namesList) {
            System.out.println(names);
        }
    }
}
