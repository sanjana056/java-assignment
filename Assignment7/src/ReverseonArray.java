import java.util.Scanner;
public class ReverseonArray {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = scanner.nextInt();
        int [] array = new int [n];
        System.out.println("Enter the element of the array:");
        for(int i = 0;i<n;i++){
            array[i] = scanner.nextInt();
        }
        for(int i = 0; i < n / 2;i++){
            int temp = array[i];
            array[i] =array[n -1 -i];

        }
        System.out.println("Reversed array:");
        for(int i = 0; i < n; i++){
            System.out.println(array[i] + "");
        }


    }
}



