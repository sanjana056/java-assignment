import java.util.Scanner;

public class Assign7 {
        public static void main(String args[]){
            System.out.println("Enter the desired string");
            Scanner scanner = new Scanner(System.in);
            String sentence1 = scanner.nextLine();
            String sentence = sentence1.toLowerCase();

            int i;

            for(i=0;i<=sentence.length()-1;i++) {
                if (sentence.charAt(i) == 'a' || sentence.charAt(i) == 'e' || sentence.charAt(i) == 'i' || sentence.charAt(i) == 'o' || sentence.charAt(i) == 'u'){
                    continue;
                }
                System.out.print(sentence.charAt(i) + "");

            }


        }
    }

