import java.util.Scanner;
public class SumPositiveIntegers {
        public static void main(String[] args) {
            // Create a Scanner object to read input from the user
            Scanner scanner = new Scanner(System.in);
            int sum = 0;
            System.out.println("Enter integers (0 to stop):");
            int number;
            while (true) {
                number = scanner.nextInt();
                if (number == 0) {
                    break;
                }
                if (number > 0) {
                    sum += number;
                }
            }
            System.out.println("Sum of positive integers: " + sum);

            // Close the scanner
            scanner.close();
        }
    }


