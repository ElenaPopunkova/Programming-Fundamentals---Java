package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class SumOfChars_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countSymbols = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int symbols = 1; symbols <= countSymbols; symbols++) {
            char value = scanner.nextLine().charAt(0);
            int code = (int) value;
            sum += code;
        }
        System.out.printf("The sum equals: %d", sum);
    }
}
