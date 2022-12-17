package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class WaterOverflow_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int tankCapacity = 255;
        int currentStorage = 0;

        for (int i = 0; i < n; i++) {
            int incomingWater = Integer.parseInt(scanner.nextLine());

            if (currentStorage + incomingWater <= tankCapacity) {
                currentStorage += incomingWater;
            } else {
                System.out.println("Insufficient capacity!");
            }
        }
        System.out.println(currentStorage);
    }
}
