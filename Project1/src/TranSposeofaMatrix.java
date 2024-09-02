import java.util.Scanner;
public class TranSposeofaMatrix {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int[][] matrix = new int[3][3];
            System.out.println("Enter the element of a 3*3 matrix:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(" Element[" + i + "][" + j + "]:");
                    matrix[i][j] = scanner.nextInt();
                }
            }
            int[][] transpose = new int[3][3];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    transpose[i][j] = matrix[i][j];
                }
            }
            System.out.println("Original matrix:");
            printMatrix(matrix);

            System.out.println("Transposed matrix:");
            printMatrix(transpose);
        }
        public static void  printMatrix(int[][]matrix) {
            for (int j = 0; j < 3; j++) {
                for (int i = 0; i < 3; i++) {
                    System.out.println(matrix[i][j] + " ");
                }
                    System.out.println();
                }
            }

        }
