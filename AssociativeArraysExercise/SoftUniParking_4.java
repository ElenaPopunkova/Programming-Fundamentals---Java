package AssociativeArraysExercise;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Double> priceMap = new LinkedHashMap<>();
        Map<String, Integer> quantityMap = new LinkedHashMap<>();

        String foodStuffs = scanner.nextLine();
        while (!foodStuffs.equals("end")) {
            String product = foodStuffs.split(" ")[0];
            double price = Double.parseDouble(foodStuffs.split(" ")[1]);
            int quantity = Integer.parseInt(foodStuffs.split(" ")[2]);

            priceMap.put(product, price);

            if(!quantityMap.containsKey(product)) {
                quantityMap.put(product, quantity);
            } else {
                quantityMap.put(product, quantityMap.get(product) + quantity);
            }
            foodStuffs = scanner.nextLine();
        }
        for (Map.Entry<String, Double> entry : priceMap.entrySet()) {
            String productName = entry.getKey();
            double finalSum = entry.getValue() * quantityMap.get(productName);
            System.out.printf("%s -> %.2f%n", productName, finalSum);
        }
    }
}
