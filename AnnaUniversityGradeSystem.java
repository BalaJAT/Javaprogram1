package learning.java;

import java.util.Scanner;

public class AnnaUniversityGradeSystem {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your marks: ");
        int marks = scanner.nextInt();

        if (marks >= 0 && marks <= 100) {
            String grade = calculateGrade(marks);
            System.out.println("Your grade is: " + grade);
        } else {
            System.out.println("Invalid input");
        }

        scanner.close();
    }
    public static String calculateGrade(int marks) {
        if (marks == 100) {
            return "S";
        } else if (marks >= 90) {
            return "A";
        } else if (marks >= 80) {
            return "B";
        } else if (marks >= 70) {
            return "C";
        } else if (marks >= 60) {
            return "D";
        } else if (marks >= 50) {
            return "E";
        } else {
            return "F";
        }
    }
}
