import java.util.Scanner;
public class SumOfNumberAsString {

        public static void main(String[] args) {
            // Create a Scanner object for user input
            Scanner scanner = new Scanner(System.in);
            // enter the first number as a string
            System.out.print("Enter the first number: ");
            String firstNumberString = scanner.nextLine();
            //enter the second number as a string
            System.out.print("Enter the second number: ");
            String secondNumberString = scanner.nextLine();
            String concatenatedResult = firstNumberString + secondNumberString;
            System.out.println("The concatenated result is: " + concatenatedResult);
            scanner.close();
        }
    }


