import java.util.Scanner;

public class FactorialCalculator {
    public static int factorial(int n){
        if (n == 0){
            return 1;
        }
        return  n * factorial(n -1);
    }
    public  static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive integer:");
        int number = scanner.nextInt();
        if(number < 0){
            System.out.println("please enter a positive integer.");
        }else {
            int result = factorial(number);
            System.out.println("Factorial of " + number +"is:" + result);
        }
        scanner.close();
    }
}
