package MethodsExercise;

import java.util.Scanner;

public class PasswordValidator_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String passInput = scanner.nextLine();

        boolean lengthCheckB = lengthCheck(passInput);
        boolean twoDigitsCheckB = twoDigitsCheck(passInput);
        boolean charTypeCheckB = charTypeCheck(passInput);

        if (!lengthCheckB){
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!charTypeCheckB) {
            System.out.println("Password must consist only of letters and digits");
        }
        if (!twoDigitsCheckB) {
            System.out.println("Password must have at least 2 digits");
        }
        if (lengthCheckB && charTypeCheckB && twoDigitsCheckB) {
            System.out.println("Password is valid");
        }
    }
    public static boolean lengthCheck (String password) {
        return password.length() >= 6 && password.length() <= 10;
    }
    public static boolean charTypeCheck (String password) {
        for (char symbol : password.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol)) {
                return false;
            }
        }
        return true;
    }
    public static boolean twoDigitsCheck (String password) {
        int digitCount = 0;
        for (char symbol : password.toCharArray()) {
            if (Character.isDigit(symbol)) {
                digitCount++;
            }
        }
        return digitCount >= 2;
    }
}
