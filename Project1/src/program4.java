import java.util.Scanner;
public class program4 {
    public static void main(String[]args){
        //creating a scanner obj
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to be scanner");
        int num=sc.nextInt();
        if(num%2==0) {
            System.out.println(num + "is even");
        }
            else{
                System.out.println(num+"is odd");
            }
    }
}
