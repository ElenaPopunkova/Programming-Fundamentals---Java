package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class Snowballs_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfSnowballs = Integer.parseInt(scanner.nextLine());

        int snowballSnow = 0;
        int snowballTime = 0;
        int snowballQuality = 0;
        double placeholderValue = Double.MIN_VALUE;
        int placeholderSnow = Integer.MIN_VALUE;
        int placeholderTime = Integer.MIN_VALUE;
        int placeholderQuality = Integer.MIN_VALUE;

        for (int i = 1; i <= numberOfSnowballs; i++) {
            snowballSnow = Integer.parseInt(scanner.nextLine());
            snowballTime = Integer.parseInt(scanner.nextLine());
            snowballQuality = Integer.parseInt(scanner.nextLine());

            double snowballValue = Math.pow((snowballSnow / snowballTime), snowballQuality);
            if (snowballValue >= placeholderValue) {
                placeholderValue = snowballValue;
                placeholderSnow = snowballSnow;
                placeholderTime = snowballTime;
                placeholderQuality = snowballQuality;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)", placeholderSnow, placeholderTime, placeholderValue, placeholderQuality);
    }
}