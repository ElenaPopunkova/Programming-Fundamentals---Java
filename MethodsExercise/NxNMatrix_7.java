package MethodsExercise;

import java.util.Scanner;

public class NxNMatrix_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        matrixPrint(number);
    }
    public static void matrixPrint (int num) {
        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <= num; col++) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
