import java.util.*;
public class Assignment3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");

        String word1 = sc.nextLine();
        String word2 = word1.toLowerCase();
        String word = word2.replaceAll("\\s"," ");
        System.out.println(word);
        int i;
        int count=0,count1=0;
        for(i=word.length()-1; i>=0; i--){
            char alpha = word.charAt(i);
            if(Character.isLetter(alpha)){
                if( alpha == 'a' || alpha == 'e' || alpha == 'i' || alpha == 'o' || alpha == 'u'){
                    count++;
                }
                else{
                    count1++;
                }

            }

        }
        System.out.println("Vowels : " + count);
        System.out.println("consonants : " + count1);
    }
}