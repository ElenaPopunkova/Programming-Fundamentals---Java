package Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numInput = Double.parseDouble(scanner.nextLine());
        double powerInput = Double.parseDouble(scanner.nextLine());

        double result = mathPower(numInput, powerInput);

        DecimalFormat dF = new DecimalFormat("0.####");
        System.out.println(dF.format(result));
    }
    public static double mathPower (double num, double power) {
        double result = 1;
        for (int i = 1; i <= power; i++) {
            result = result * num;
        }
        return result;
    }
}
