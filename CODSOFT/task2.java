import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        // Get the number of subjects
        System.out.print("Enter the no of subjects: ");
        int noofsubjects = sc.nextInt();

        // Get marks for each subject
        int totMark = 0;
        for (int i = 1; i <= noofsubjects; i++) {
            System.out.print("Enter marks for Subject " + i + " (out of 100): ");
            int marks = sc.nextInt();

            // Validate marks
            if (marks < 0 || marks > 100) {
                System.out.println("Invalid marks. Marks should be between 0 and 100.");
                return;
            }

            totMark += marks;
        }

        // Calculate average percentage
        double avgper = (double) totMark / noofsubjects;

        // Display total marks and average percentage
        System.out.println("\nTotal Marks: " + totMark);
        System.out.println("Average Percentage: " + avgper + "%");

        // Assign grades based on average percentage
        char grade;
        if (avgper >= 90) {
            grade = 'A';
        } else if (avgper >= 80) {
            grade = 'B';
        } else if (avgper >= 70) {
            grade = 'C';
        } else if (avgper >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Display the grade
        System.out.println("Grade: " + grade);
    }
}
