public class Maxofthree {
        public static int findMaximum(int num1, int num2, int num3) {
            int max;
            if (num1 >= num2 && num1 >= num3) {
                max = num1;
            } else if (num2 >= num1 && num2 >= num3) {
                max = num2;
            } else {
                max = num3;
            }
            return max;
        }
        public static void main(String[] args) {

            java.util.Scanner scanner = new java.util.Scanner(System.in);
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();
            System.out.print("Enter the third number: ");
            int num3 = scanner.nextInt();
            int maximum = findMaximum(num1, num2, num3);
            System.out.println("The maximum number is: " + maximum);
            scanner.close();
        }
    }


