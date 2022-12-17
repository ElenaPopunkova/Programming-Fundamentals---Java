package TextProcessing;

import java.util.Scanner;

public class ReverseStrings_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();
        while (!inputLine.equals("end")) {
            String reversedWord = "";
            for (int i = inputLine.length() - 1; i >= 0; i--) {
                char currentSymbol = inputLine.charAt(i);
                reversedWord = reversedWord + currentSymbol;
            }
            System.out.printf("%s = %s\n", inputLine, reversedWord);

            inputLine = scanner.nextLine();
        }
    }
}
