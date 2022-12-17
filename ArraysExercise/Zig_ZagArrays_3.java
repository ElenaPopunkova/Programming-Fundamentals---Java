package ArraysExercise;

import java.util.Scanner;

public class Zig_ZagArrays_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        String[] firstArray = new String[rows];
        String[] secondArray = new String[rows];

        for (int row = 1; row <= rows; row++) {
            String[] numbers = scanner.nextLine().split(" ");
            String firstNum = numbers[0];
            String secondNum = numbers[1];

            if (row % 2 == 0) {
                secondArray[row - 1] = firstNum;
                firstArray[row - 1] = secondNum;
            } else {
                secondArray[row - 1] = secondNum;
                firstArray[row - 1] = firstNum;
            }
        }
        System.out.println(String.join(" ", firstArray));
        System.out.println(String.join(" ", secondArray));

    }
}