import java.util.Scanner;

public class StudentEnrollment {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Declare variables for student information
        String studentName;
        String course;
        String courseCode;
        int numberOfUnits;

        // Constants
        final int MAX_UNITS = 10; // Maximum number of subjects
        final int FEE_PER_UNIT = 1000; // Fee per unit

        // Input student information
        System.out.print("Enter Student Name: ");
        studentName = scanner.nextLine();

        System.out.print("Enter Course: ");
        course = scanner.nextLine();

        System.out.print("Enter Course Code: ");
        courseCode = scanner.nextLine();

        // Input the number of units and validate the input
        do {
            System.out.print("Enter Number of Units (1 to " + MAX_UNITS + "): ");
            numberOfUnits = scanner.nextInt();
            if (numberOfUnits < 1 || numberOfUnits > MAX_UNITS) {
                System.out.println("Invalid number of units. Please enter a value between 1 and " + MAX_UNITS + ".");
            }
        } while (numberOfUnits < 1 || numberOfUnits > MAX_UNITS);

        // Calculate total enrollment fee
        int totalEnrollmentFee = numberOfUnits * FEE_PER_UNIT;

        // Output student information and total fee
        System.out.println("\n--- Student Enrollment Details ---");
        System.out.println("Student Name: " + studentName);
        System.out.println("Course: " + course);
        System.out.println("Course Code: " + courseCode);
        System.out.println("Total Enrollment Fee: " + totalEnrollmentFee);

        // Input payment amount from the student
        System.out.print("Enter Payment Amount: ");
        int paymentAmount = scanner.nextInt();
        System.out.println();

        // Check payment status
        if (paymentAmount == totalEnrollmentFee) {
            System.out.println("Status: Fully Paid");
        } else if (paymentAmount < totalEnrollmentFee) {
            System.out.println("Status: Partial Payment of " + paymentAmount);
        } else {
            System.out.println("Status: Overpayment of " + (paymentAmount - totalEnrollmentFee));
        }

        System.out.println("***********************************");
        System.out.println();

        // Close the scanner
        scanner.close();
    }
}
