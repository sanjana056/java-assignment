import java.util.Scanner;
   public class Palindromechecker {
        public static void main(String[] args) {
            // Create a Scanner object to read input from the user
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String original = scanner.nextLine();
            boolean isPalindrome = true;
            String lowerCaseString = original.toLowerCase();
            int length = lowerCaseString.length();
            for (int i = 0; i < length / 2; i++) {
                if (lowerCaseString.charAt(i) != lowerCaseString.charAt(length - i - 1)) {
                    isPalindrome = false;
                    break;
                }
            }
            if (isPalindrome) {
                System.out.println(original + " is a palindrome.");
            } else {
                System.out.println(original + " is not a palindrome.");
            }
            // Close the scanner
            scanner.close();
        }
    }


