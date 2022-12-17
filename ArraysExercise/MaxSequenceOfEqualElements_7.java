package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sequenceCounter = 1;
        int maxCount = 0;
        int digitOfSequence = 0;
        for (int index = 1; index < numbers.length; index++) {
            if (numbers[index] == numbers[index - 1]) {
                sequenceCounter++;
                if (maxCount < sequenceCounter) {
                    maxCount = sequenceCounter;
                    digitOfSequence = numbers[index];
                }
            } else {
                sequenceCounter = 1;
            }
        }
        for (int i = 0; i < maxCount; i++) {
            System.out.print(digitOfSequence + " ");
        }
    }
}