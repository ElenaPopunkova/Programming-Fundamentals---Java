package ObjectsAndClasses;

import java.util.Random;
import java.util.Scanner;

public class RandomizeWords_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String words = scanner.nextLine();
        String[] wordsArr = words.split("\\s+");

        Random random = new Random();
        for (int i = 0; i < wordsArr.length; i++) {
            int index1 = random.nextInt(wordsArr.length);
            int index2 = random.nextInt(wordsArr.length);

            String previousWord1 = wordsArr[index1];
            wordsArr[index1] = wordsArr[index2];
            wordsArr[index2] = previousWord1;
        }
        System.out.println(String.join(System.lineSeparator(), wordsArr));
    }
}