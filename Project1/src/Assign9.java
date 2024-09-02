import java.util.Scanner;

public class Assign9 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int sum = 0;
            int number;
            while (true) {
                System.out.print("Enter a number (0 to exit): ");
                number = scanner.nextInt();
                if (number == 0) {
                    break;
                }
                if (number < 0) {
                    continue;
                }
                sum += number;
            }
            scanner.close();
            System.out.println("The sum of positive numbers is: " + sum);
        }
    }


