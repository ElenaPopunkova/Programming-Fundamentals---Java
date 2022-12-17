package Methods;

import java.util.Scanner;

public class MathOperations_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        char operator = scanner.nextLine().charAt(0);
        int number2 = Integer.parseInt(scanner.nextLine());

        double result = mathOperationAssembly(number1, operator, number2);

        System.out.printf("%.0f", result);

    }
    private static double mathOperationAssembly (int a, char operator, int b) {
        double result = 0.0;

        switch (operator) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / (b * 1.00);
                break;
        }
        return result;
    }
}
