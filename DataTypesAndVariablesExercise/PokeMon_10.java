package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class PokeMon_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int power = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int factor = Integer.parseInt(scanner.nextLine());
        int pokeCount = 0;
        int initialPower = power;

        while (power >= distance) {
            power -= distance;
            if (power == initialPower / 2) {
                if (factor != 0) {
                    power /= factor;
                }
            }
            pokeCount++;
        }
        System.out.println(power);
        System.out.println(pokeCount);
    }
}
