import java.util.Scanner;

public class SikpNegativeNumber {
        public static void main(String[] args) {
            // Create a Scanner object to read input
            Scanner scanner = new Scanner(System.in);
            int sum = 0;
            while (true) {
                // Prompt the user to enter a number
                System.out.println("Enter a number (0 to exit): ");
                int number = scanner.nextInt();
                if (number == 0) {
                    break;
                }
                if (number < 0) {
                    continue;
                }
                sum += number;
            }
            System.out.println("The sum of positive numbers is: " + sum);

            // Close the scanner
            scanner.close();
        }
    }


