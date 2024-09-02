import java.util.Scanner;

public class ConcatenateFirstAndLastName {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        // the user to enter their first name
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();
        //the user to enter their last name
        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();
        String fullName = firstName + " " + lastName;
        // Output the full name
        System.out.println("Full name: " + fullName);

        // Close the scanner
        scanner.close();
    }
}


