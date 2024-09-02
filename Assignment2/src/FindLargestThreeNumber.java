import java.util.Scanner;
public class FindLargestThreeNumber {

        public static void main(String[] args) {
            // Create a Scanner object to read input
            Scanner scanner = new Scanner(System.in);

            // the user to enter three numbers
            System.out.print("Enter the 1st number: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter the 2nd number: ");
            int num2 = scanner.nextInt();
            System.out.print("Enter the 3rd number: ");
            int num3 = scanner.nextInt();

            int largest;
            if (num1 >= num2) {
                if (num1 >= num3) {
                    largest = num1;
                } else {
                    largest = num3;
                }
            } else {
                if (num2 >= num3) {
                    largest = num2;
                } else {
                    largest = num3;
                }
            }
            // Display the result
            System.out.println("1st Number = " + num1);
            System.out.println("2nd Number = " + num2);
            System.out.println("3rd Number = " + num3);
            System.out.println("The " + (largest == num1 ? "1st" : (largest == num2 ? "2nd" : "3rd")) + " Number is the greatest among three");

            scanner.close();
        }
    }


