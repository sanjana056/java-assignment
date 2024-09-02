import java.util.Scanner;
public class progaram5 {
    public static void main(String[]args){
    //Creating a new scanner obj
        System.out.println("enter the find maximum of three number");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the three number");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        if(a>b&&a>c){
            System.out.println(a+"is maximum");
        }
        else{
            if(b>a&&b>c){
                System.out.println(b +"is maximum");
            }
            else{
                System.out.println(c+"is maximum");
            }
        }
    }

}
