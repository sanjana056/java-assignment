import java.util.Scanner;
public class findthesumofeach {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        final int SIZE = 3;
        int[][] matrix = new int[SIZE][SIZE];
        System.out.println("Enter the elements of a 3x3 matrix:");
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }


    }
}