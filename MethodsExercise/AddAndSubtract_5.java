package MethodsExercise;

import java.util.Scanner;

public class AddAndSubtract_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int n3 = Integer.parseInt(scanner.nextLine());

        int sumOfNums = sum(n1, n2);
        int subtractOfNums = subtract(sumOfNums, n3);

        System.out.println(subtractOfNums);
    }
    public static int sum (int num1, int num2) {
        return num1 + num2;
    }
    public static int subtract (int sum, int num3) {
        return sum - num3;
    }
}