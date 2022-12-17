package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class Ages_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        if (n >= 0 && n <= 2) {
            System.out.println("baby");
        } else if (n <= 13 && n >=3) {
            System.out.println("child");
        } else if (n <= 19 && n >= 14) {
            System.out.println("teenager");
        } else if (n >= 20 && n <= 65) {
            System.out.println("adult");
        } else if (n >= 66) {
            System.out.println("elder");
        }
    }
}
