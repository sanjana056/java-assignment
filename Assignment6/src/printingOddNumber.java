public class printingOddNumber {
        public static void main(String[] args) {
            // Iterate from 1 to 50
            for (int i = 1; i <= 50; i++) {
                // Check if the current number is odd
                if (i % 2 != 0) {
                    continue;
                }
                System.out.println(i);
            }
        }
    }


