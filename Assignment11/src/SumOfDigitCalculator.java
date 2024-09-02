import java.util.Scanner;

public class SumOfDigitCalculator {
    public static int sumOfDigits(int n){
        if (n == 0){
            return  0;
        }
        return  (n % 10) + sumOfDigits(n / 10);
    }
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a integer");
        int number = scanner.nextInt();
        int result = sumOfDigits(Math.abs(number));
        System.out.println("Sum of digits of " + number + result);
        scanner.close();
    }
}
