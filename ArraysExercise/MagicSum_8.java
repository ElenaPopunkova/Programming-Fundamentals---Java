package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = Arrays.stream(scanner.nextLine()
                .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int magicSum = Integer.parseInt(scanner.nextLine());

        for (int index = 0; index <= nums.length - 1; index++) {
            int currentNum = nums[index];
            for (int inIndex = index + 1; inIndex <= nums.length - 1; inIndex++) {
                int inNum = nums[inIndex];

                if (currentNum + inNum == magicSum) {
                    System.out.println(currentNum + " " + inNum);
                }
            }
        }
    }
}
