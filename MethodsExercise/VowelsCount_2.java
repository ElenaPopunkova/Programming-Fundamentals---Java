package MethodsExercise;

import java.util.Scanner;

public class VowelsCount_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        printVowelsCount(input.toLowerCase());
    }
    public static void printVowelsCount (String text) {
        int counter = 0;
        for (char symbol : text.toCharArray()) {
            if (symbol == 'a' || symbol == 'o' || symbol == 'u' || symbol == 'e' || symbol == 'i') {
                counter++;
            }
        }
        System.out.println(counter);
    }
}