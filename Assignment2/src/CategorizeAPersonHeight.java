import java.util.Scanner;
public class CategorizeAPersonHeight {

        public static void main(String[] args) {
            // Create a Scanner object to read input
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your height in cm: ");
            int height = scanner.nextInt();
            if (height < 150) {
                System.out.println("The person is Dwarf.");
            } else if (height >= 150 && height <= 165) {
                System.out.println("The person has Average height.");
            } else {
                System.out.println("The person is Tall.");
            }
            // Close the scanner
            scanner.close();
        }
    }


