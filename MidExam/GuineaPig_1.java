package MidExam;

import java.util.Scanner;

public class GuineaPig_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double foodQuantity = Double.parseDouble(scanner.nextLine());
        double hayQuantity = Double.parseDouble(scanner.nextLine());
        double coverQuantity = Double.parseDouble(scanner.nextLine());
        double piggysWeight = Double.parseDouble(scanner.nextLine());

        double foodGrams = foodQuantity * 1000;
        double hayGrams = hayQuantity * 1000;
        double coverGrams = coverQuantity * 1000;
        double piggyGrams = piggysWeight * 1000;

        boolean isEnough = true;
        for (int day = 1; day <= 30; day++) {
            foodGrams -= 300;
            if (day % 2 == 0) {
                hayGrams = hayGrams - (foodGrams * 0.05);
            }
            if (day % 3 == 0) {
                coverGrams = coverGrams - (piggyGrams / 3);
            }
            if (foodGrams <= 0 || hayGrams <= 0 || coverGrams <= 0) {
                isEnough= false;
                break;
            }
        }
        if (isEnough) {
            System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.",
                    foodGrams / 1000, hayGrams / 1000, coverGrams / 1000);
        } else {
            System.out.println("Merry must go to the pet store!");
        }
    }
}

