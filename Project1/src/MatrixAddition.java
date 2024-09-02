import java.util.Scanner;
public class MatrixAddition {
   public static void main(String[]args){
       Scanner scanner = new Scanner(System.in);
       int [][]matrix1=new int [2][2];
       int [][]matrix2 = new int [2][2];
       int [][] resultMatrix = new int [2][2];
       System.out.println("Enter element for the first 2*2 matrix");
       for(int i = 0;i<2;i++){
           for(int j =0;j<2;j++){
              System.out.printf("Enter element at position [%d][%d]:", i,j);
              matrix1[i][j]= scanner.nextInt();
           }
       }
       System.out.println("enter elements for the second 2*2 matrix ");
       for (int i = 0;i<2;i++){
           for (int j = 0;j<2;j++){
               System.out.printf("Enter elements at position [%d][%d]:" , i,j);
               matrix2[i][j] = scanner.nextInt();
           }
       }
       for (int i = 0;i<2;i++){
           for (int j = 0;j<2;j++) {
                resultMatrix[i][j] = matrix1[i][j]+matrix2[i][j];
           }
            }
       System.out.println("Resulting matrix after addition:");
       for (int i = 0;i<2;i++) {
           for (int j = 0; j < 2; j++) {
               System.out.println(resultMatrix[i][j] + "");
           }
           System.out.println();
       }
       scanner.close();
   }
}
