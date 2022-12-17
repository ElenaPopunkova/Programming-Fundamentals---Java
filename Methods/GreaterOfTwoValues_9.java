package Methods;

import java.util.Scanner;

public class GreaterOfTwoValues_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();

        switch (type) {
            case "int":
                int firstNum = Integer.parseInt(scanner.nextLine());
                int secondNum = Integer.parseInt(scanner.nextLine());

                System.out.println(getMaxNum(firstNum, secondNum));
                break;
            case "char":
                char firstSymbol = scanner.nextLine().charAt(0);
                char secondSymbol = scanner.nextLine().charAt(0);

                System.out.println(getMaxSymbol(firstSymbol, secondSymbol));
                break;
            case "string":
                String firstText = scanner.nextLine();
                String secondtText = scanner.nextLine();

                System.out.println(getMaxText(firstText, secondtText));
                break;
        }
    }
    public static int getMaxNum (int firstNum, int secondNum) {
        if (firstNum > secondNum) {
            return firstNum;
        } else {
            return secondNum;
        }
    }
    public static char getMaxSymbol (char firstSymbol, char secondSymbol) {
        if (firstSymbol > secondSymbol) {
            return firstSymbol;
        } else {
            return secondSymbol;
        }
    }
    public static String getMaxText (String firstText, String secondtText) {
        if (firstText.compareTo(secondtText) > 0) {
            return firstText;
        } else {
            return secondtText;
        }
    }
}
