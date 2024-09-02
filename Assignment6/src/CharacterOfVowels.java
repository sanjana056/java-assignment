import java.util.Scanner;

public class CharacterOfVowels {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a string: ");
            String inputString = scanner.nextLine();
            String vowels = "AEIOUaeiou";
            for (int i = 0; i < inputString.length(); i++) {
                char currentChar = inputString.charAt(i);
                if (vowels.indexOf(currentChar) != -1) {
                    continue;
                }
                System.out.print(currentChar);
            }
            System.out.println();
            scanner.close();
        }
    }


