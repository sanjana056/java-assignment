import java.util.Scanner;
public class Assign5 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a string:");
            String input = scanner.nextLine();
            input = input.toLowerCase();
            String vowels = "aeiou";
            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);
                if (vowels.indexOf(ch) != -1) {
                    continue;
                }
                System.out.print(ch);
            }
            // Close the scanner
            scanner.close();
        }
    }


