package MethodsExercise;

import java.util.Scanner;

public class CharactersInRange_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char symbol1 = scanner.nextLine().charAt(0);
        char symbol2 = scanner.nextLine().charAt(0);

        printSmallerChar(symbol1, symbol2);
    }
    public static void printSmallerChar (char s1, char s2) {
        if (s1 < s2) {
            for (char symbol = (char)(s1 + 1); symbol < s2; symbol++) {
                System.out.print(symbol + " ");
            }
        } else {
            for (char symbol = (char)(s2 + 1); symbol < s1; symbol++) {
                System.out.print(symbol + " ");
            }
        }
    }
}

