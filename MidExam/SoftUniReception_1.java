package MidExam;

import java.util.Scanner;

public class SoftUniReception_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstEmpl = Integer.parseInt(scanner.nextLine());
        int secondEmpl = Integer.parseInt(scanner.nextLine());
        int thirdEmpl = Integer.parseInt(scanner.nextLine());
        int studentCount = Integer.parseInt(scanner.nextLine());

        int hourCount = 0;

        while (studentCount > 0) {
            hourCount++;
            if (hourCount % 4 != 0) {
                studentCount = studentCount - firstEmpl - secondEmpl - thirdEmpl;
            }
        }
        System.out.printf("Time needed: %dh.", hourCount);
    }
}
