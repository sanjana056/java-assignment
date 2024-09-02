import java.util.Scanner;
    public class AddTwoNumber {
        public static void main(String[] args) {
            // Create a Scanner object to read input from the user
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();
            int sum = num1 + num2;
            System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
            // Close the scanner
            scanner.close();
        }
    }


