package MethodsExercise;

import java.util.Scanner;

public class TopNumber_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int number = 1; number <= n; number++) {
            if (isSumOfDigitsDivisibleByEight(number) && containsOddDigit(number)) {
                System.out.println(number);
            }
        }
    }
    public static boolean isSumOfDigitsDivisibleByEight (int num) {
        int sumOfDigits = 0;
        while (num != 0) {
            int lastDigit = num % 10;
            sumOfDigits += lastDigit;
            num /= 10;
        }
        return sumOfDigits % 8 == 0;
    }
    public static boolean containsOddDigit (int num) {
        while (num != 0) {
            int lastDigit = num % 10;
            if (lastDigit % 2 != 0) {
                return true;
            } else {
                num /= 10;
            }
        }
        return false;
    }
}
