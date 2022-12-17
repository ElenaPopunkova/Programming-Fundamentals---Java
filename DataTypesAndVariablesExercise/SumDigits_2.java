package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class SumDigits_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int n = Integer.parseInt(scanner.nextLine());
        while (n > 0) {
            int lastDigit = n % 10;
            sum += lastDigit;
            n /= 10;
        }
        System.out.println(sum);
    }
}
