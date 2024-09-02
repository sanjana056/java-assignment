import java.util.Scanner;

public class SumOfNumberUnitl100 {
        public static void main(String[] args) {
            // Create a Scanner object to read input
            Scanner scanner = new Scanner(System.in);
            int sum = 0;
            while (true) {
                System.out.println("Enter a number: ");
                int number = scanner.nextInt();
                sum += number;
                if (sum >= 100) {
                    break;
                }
            }
            System.out.println("The final sum is: " + sum);
            scanner.close();
        }
    }


