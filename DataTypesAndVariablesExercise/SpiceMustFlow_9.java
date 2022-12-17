package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class SpiceMustFlow_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int source = Integer.parseInt(scanner.nextLine());

        int days = 0;
        int totalSpiceAmount = 0;

        while (source >= 100) {
            int spices = source - 26;
            totalSpiceAmount += spices;
            days++;
            source -= 10;
        }
        System.out.println(days);

        if (totalSpiceAmount >= 26) {
            totalSpiceAmount -= 26;
        }
        System.out.println(totalSpiceAmount);
    }
}