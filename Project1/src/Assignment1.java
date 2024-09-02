public class Assignment1 {
    public static void main(String[]args){
        String originalStr="Hello ";
        String reversedStr="";
        System.out.println("original String:"+ originalStr);
        for (int i = 0;i < originalStr.length();i++){
            reversedStr = originalStr.charAt(i) + reversedStr;
        }
        System.out.println("Reversed string:" + reversedStr);
    }
}
