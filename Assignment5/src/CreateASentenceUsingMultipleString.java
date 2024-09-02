import java.util.Scanner;
public class CreateASentenceUsingMultipleString {

        public static void main(String[] args) {
            // Create a Scanner object for user input
            Scanner scanner = new Scanner(System.in);
            // The user to enter the first number as a string
            System.out.print("Enter the first number: ");
            String firstNumberString = scanner.nextLine();
            // the user to enter the second number as a string
            System.out.print("Enter the second number: ");
            String secondNumberString = scanner.nextLine();
            // the string inputs to integers
            int firstNumber = Integer.parseInt(firstNumberString);
            int secondNumber = Integer.parseInt(secondNumberString);
            // Calculate the sum
            int sum = firstNumber + secondNumber;
            // Output the result
            System.out.println("The sum of " + firstNumber + " and " + secondNumber + " is " + sum + ".");
            // Close the scanner
            scanner.close();
        }
    }


