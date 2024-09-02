import java.util.Scanner;
public class SearchCharacterInString {
        public static void main(String[] args) {
            // Create a Scanner object to read input
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a string: ");
            String inputString = scanner.nextLine();
            System.out.println("Enter a character to search for: ");
            char searchChar = scanner.next().charAt(0);
            int position = -1;
            for (int i = 0; i < inputString.length(); i++) {
                if (inputString.charAt(i) == searchChar) {
                    position = i;
                    break;
                }
            }
            if (position != -1) {
                System.out.println("Character '" + searchChar + "' found at position: " + position);
            } else {
                System.out.println("Character '" + searchChar + "' not found in the string.");
            }
            scanner.close();
        }
    }


