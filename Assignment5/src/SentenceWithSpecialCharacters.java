import java.util.Scanner;
public class SentenceWithSpecialCharacters {

        public static void main(String[] args) {
            // Create a Scanner object for user input
            Scanner scanner = new Scanner(System.in);

            // Prompt the user to enter the street, city, and zip code
            System.out.print("Enter your street address: ");
            String street = scanner.nextLine();

            System.out.print("Enter your city: ");
            String city = scanner.nextLine();

            System.out.print("Enter your zip code: ");
            String zipCode = scanner.nextLine();

            // the address as a multi-line string
            String address = "Address:\n" +
                    "\t" + street + "\n" +
                    "\t" + city + ", " + zipCode;
            System.out.println(address);
            // Close the scanner
            scanner.close();
        }
    }


