import java.util.Scanner;
public class CountNumberOfVowelsAndConsonants {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            // Prompt the user to enter a string
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();
            int vowelCount = 0;
            int consonantCount = 0;
            String normalizedInput = input.toLowerCase();
            for (int i = 0; i < normalizedInput.length(); i++) {
                char ch = normalizedInput.charAt(i);
                if (Character.isLetter(ch)) {
                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                        vowelCount++;
                    } else {
                        consonantCount++;
                    }
                }
            }

            System.out.println("Number of vowels: " + vowelCount);
            System.out.println("Number of consonants: " + consonantCount);

            scanner.close();
        }
    }


