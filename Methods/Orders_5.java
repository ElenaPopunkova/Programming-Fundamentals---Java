package Methods;

import java.util.Scanner;

public class Orders_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        doMaths(type, quantity);
    }
    public static void doMaths (String type, int quantity) {
        double price = 0.0;

        switch (type) {
            case "coffee":
                price = 1.50 * quantity;
                break;
            case "water":
                price = 1.00 * quantity;
                break;
            case "coke":
                price = 1.40 * quantity;
                break;
            case "snacks":
                price = 2.00 * quantity;
                break;
        }
        System.out.printf("%.02f", price);
    }
}
