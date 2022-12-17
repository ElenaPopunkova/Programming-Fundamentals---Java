package Methods;

import java.util.Scanner;

public class MultiplyEvensByOdds_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        if (input < 0) {
            input = input * (-1);
        }
        int result = muliplyEvenAndOddNums(input);

        System.out.println(Math.abs(result));

    }
    private static int muliplyEvenAndOddNums(int number) {
        int even = evenSum(number);
        int odd = oddSum(number);

        return even * odd;
    }
    private static int evenSum(int number) {
        int even = 0;
        while (number != 0) {
            int digits = number % 10;
            if (digits % 2 == 0) {
                even += digits;
            }
            number /= 10;
        }
        return even;
    }
    private static int oddSum(int number) {
        int odd = 0;
        while (number != 0) {
            int digits = number % 10;
            if (digits % 2 == 1) {
                odd += digits;
            }
            number /= 10;
        }
        return odd;
    }
}
