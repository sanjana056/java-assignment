import java.util.Scanner;
public class LongestWordSentence {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            // the user to enter a sentence
            System.out.print("Enter a sentence: ");
            String sentence = scanner.nextLine();
            String[] words = sentence.split("\\s+");
            String longestWord = "";
            int maxLength = 0;
            for (String word : words) {
                if (word.length() > maxLength) {
                    longestWord = word;
                    maxLength = word.length();
                }
            }
            System.out.println("The longest word is: " + longestWord);
            System.out.println("Length of the longest word: " + maxLength);

            scanner.close();
        }
    }


