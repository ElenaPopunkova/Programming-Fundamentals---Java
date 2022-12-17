package DataTypesAndVariables;

import java.util.Scanner;

public class ConcatNames_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String name2 = scanner.nextLine();
        String delimiter = scanner.nextLine();

        String result = name + delimiter + name2;
        System.out.println(result);
    }
}
