import java.util.Scanner;
    public class Reverseanumber {
        public static void main(String[] args) {
            // Create a Scanner object to read input from the user
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            int reversedNumber = 0;
            int originalNumber = number;
            while (number != 0) {
                int digit = number % 10;       // Extract the last digit
                reversedNumber = reversedNumber * 10 + digit; // Build the reversed number
                number = number / 10;

            }
        }
    }