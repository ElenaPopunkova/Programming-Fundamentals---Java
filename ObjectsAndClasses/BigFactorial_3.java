package ObjectsAndClasses;

import java.math.BigInteger;
import java.util.Scanner;

public class BigFactorial_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        BigInteger resultBigI = new BigInteger(String.valueOf(1));
        for (int i = 1; i <= n; i++) {
            resultBigI = resultBigI.multiply(BigInteger.valueOf(i));
        }
        System.out.println(resultBigI);
    }
}
