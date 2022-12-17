package MethodsExercise;

import java.util.Scanner;

public class SmallestOfThreeNumbers_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());

        printSmallestNumber(first, second, third);
    }
    public static void printSmallestNumber (int n1, int n2, int n3) {
        if (n1 <= n2 && n1 <= n3) {
            System.out.println(n1);
        } else if (n2 <= n1 && n2 <= n3) {
            System.out.println(n2);
        } else if (n3 <= n1 && n3 <= n2) {
            System.out.println(n3);
        }
    }
}
