import java.util.Scanner;

public class Assign6 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers you want to add");
        int sum = 0;
        while (true) {
            int a = scanner.nextInt();
            sum = sum + a;
            if (sum >= 100) {
                System.out.println("100 reached");
                break;
            }
            System.out.println(sum);

        }
    }

}
