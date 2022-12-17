package BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class BackIn30Minutes_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int allMinutes = (hours * 60) + minutes + 30;
        int resultHour = allMinutes / 60;
        int resultMinutes = allMinutes % 60;

        if (resultHour > 23) {
            resultHour = 0;
        }

        System.out.printf("%d:%02d", resultHour, resultMinutes);
    }
}
