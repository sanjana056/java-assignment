import java.util.Scanner;
public class DisplayValues {

        public static void main(String[] args) {
            // Create a Scanner object to read input
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the value of m: ");
            int m = scanner.nextInt();
            //the value of n based on m
            int n;
            if (m > 0) {
                n = 1;
            } else if (m == 0) {
                n = 0;
            } else {
                n = -1;
            }
            System.out.println("The value of n = " + n);
            scanner.close();
        }
    }


