package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class Vacation_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        String group = scanner.nextLine();
        String day = scanner.nextLine();
        double price = 0;
        double dicks = 0;

        switch (group) {
            case "Students":
                switch (day) {
                    case "Friday":
                        price = 8.45 * count;
                        break;
                    case "Saturday":
                        price = 9.80 * count;
                        break;
                    case "Sunday":
                        price = 10.46 * count;
                        break;
                }
                if (count >= 30) {
                    price = price - (price * 0.15);
                }
                break;
            case "Business":
                switch (day) {
                    case "Friday":
                        dicks = 10.90;
                        price = dicks * count;
                        break;
                    case "Saturday":
                        dicks = 15.60;
                        price = dicks * count;
                        break;
                    case "Sunday":
                        dicks = 16;
                        price = dicks * count;
                        break;
                }
                if (count >= 100) {
                    price = price - (dicks * 10);
                }
                break;
            case "Regular":
                switch (day) {
                    case "Friday":
                        price = 15 * count;
                        break;
                    case "Saturday":
                        price = 20 * count;
                        break;
                    case "Sunday":
                        price = 22.50 * count;
                        break;
                }
                if (count >= 10 && count <= 20) {
                    price = price - (price * 0.05);
                }
                break;
        }
        System.out.printf("Total price: %.02f", price);
    }
}
