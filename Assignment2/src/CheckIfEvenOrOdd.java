import java.util.Scanner;
public class CheckIfEvenOrOdd {
        public static void main(String[] args) {
            // Create a Scanner object to read input
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter an integer: ");
            int number = scanner.nextInt();

            if (number % 2 == 0) {
                System.out.println(number + " is an even integer");
            } else {
                System.out.println(number + " is an odd integer");
            }
            scanner.close();
        }
    }


