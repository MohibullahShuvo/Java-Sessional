import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your exam marks: ");
        int marks = input.nextInt();

        char grade;

        if (marks >= 80 && marks <= 100) {
            grade = 'A';
        } else if (marks >= 70) {
            grade = 'B';
        } else if (marks >= 60) {
            grade = 'C';
        } else if (marks >= 50) {
            grade = 'D';
        } else if (marks >= 0) {
            grade = 'F';
        } else {
            System.out.println("Invalid marks!");
            return;
        }

        System.out.println("Your grade is: " + grade);
    }
}
