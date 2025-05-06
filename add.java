import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();  // Read the first number

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();  // Read the second number

        // Add the numbers
        int sum = num1 + num2;

        // Output the result
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

        // Close the scanner object
        scanner.close();
    }
}
