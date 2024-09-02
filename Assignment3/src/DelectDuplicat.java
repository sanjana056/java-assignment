import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class DelectDuplicat {
        public static void main(String[] args) {
            HashSet<Integer> numbers = new HashSet<>();
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.print("Enter a number: ");
                int input = scanner.nextInt();

                if (numbers.contains(input)) {
                    System.out.println("Duplicate number detected: " + input);
                    break;
                } else {
                    numbers.add(input);
                    System.out.println("Number added: " + input);
                }
            }
            scanner.close();
        }
    }


