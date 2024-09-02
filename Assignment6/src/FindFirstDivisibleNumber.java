public class FindFirstDivisibleNumber {
        public static void main(String[] args) {
            // Iterate over numbers from 1 to 100
            for (int i = 1; i <= 100; i++) {
                // Check if the number is divisible by both 3 and 7
                if (i % 3 == 0 && i % 7 == 0) {
                    System.out.println("The first number divisible by both 3 and 7 is: " + i);
                    break;
                }
            }
        }
    }


