public class Assignment5 {
    public static void main(String[] args) {
        String s = "Today is the happiest day of my life";
        String[] word = s.split(" ");
        String longword = " ";
        for (int i = 0; i < word.length; i++)
            for (int j = 1 + i; j < word.length; j++)
                if (word[i].length() >= word[j].length())
                    longword = word[i];

        System.out.println(longword + " is the longest word with " + longword.length() + " characters.");
        //System.out.println(rts.length());
    }
}




