package MidExam;

import java.util.Scanner;

public class TheHuntingGames_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int playerCount = Integer.parseInt(scanner.nextLine());
        double energy = Double.parseDouble(scanner.nextLine());
        double waterPerDay = Double.parseDouble(scanner.nextLine());
        double foodPerDay = Double.parseDouble(scanner.nextLine());
        boolean isWithoutEnergyLeft = energy <= 0;

        double totalWater = n * playerCount * waterPerDay;
        double totalFood = n * playerCount * foodPerDay;

        for (int day = 1; day <= n; day++) {
            double energyExpenditure = Double.parseDouble(scanner.nextLine());
            energy -= energyExpenditure;
            if (day % 2 == 0) {
                totalWater -= totalWater * 0.3;
                energy += energy * 0.05;
            }
            if (day % 3 == 0) {
                totalFood = totalFood / playerCount;
                energy += energy * 0.1;
            }
            if (isWithoutEnergyLeft) {
                break;
            }
        }
        if (isWithoutEnergyLeft) {
            System.out.printf("You will run out of energy. You will be left with %f food and %f water.", totalFood, totalWater);
        } else {
            System.out.printf("You are ready for the quest. You will be left with - %.2f energy~", energy);
        }
    }
}
