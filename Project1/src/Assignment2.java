import java.util.Scanner;
public class Assignment2 {
    public static void main(String[]args){
        //creating a scanner obj
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the string");
        String hello=sc.next();
        int i=hello.length()-1;
        //working
        for(;i>=0;i--){
            System.out.println(hello.charAt(i));
        }

    }

}
