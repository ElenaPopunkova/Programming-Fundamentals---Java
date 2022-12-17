package ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students_5 {
    static class Student {
        private String firstName;
        private String lastName;
        private int age;
        private String homeTown;

        public Student (String firstName, String lastName, int age, String homeTown) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.homeTown = homeTown;
        }

        public String getHomeTown() {
            return this.homeTown;
        }
        public String getFirstName() {
            return this.firstName;
        }
        public String getLastName() {
            return this.lastName;
        }
        public int getAge() {
            return this.age;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> studentsList = new ArrayList<>();

        String inputLine = scanner.nextLine();
        while (!inputLine.equals("end")) {
            String[] arrStudentData = inputLine.split("\\s+");
            String firstName = arrStudentData[0];
            String lastName = arrStudentData[1];
            int age = Integer.parseInt(arrStudentData[2]);
            String homeTown = arrStudentData[3];

            Student currentStudent = new Student(firstName, lastName, age, homeTown);
            studentsList.add(currentStudent);

            inputLine = scanner.nextLine();
        }
        String homeTown = scanner.nextLine();

        for (Student item : studentsList) {
            if (item.getHomeTown().equals(homeTown)) {
                System.out.printf("%s %s is %d years old\n", item.getFirstName(), item.getLastName(), item.getAge());
            }
        }
    }
}

