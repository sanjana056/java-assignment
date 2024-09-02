public class MultipleOfFive {
        public static void main(String[] args) {
            // Iterate through numbers from 1 to 50
            for (int i = 1; i <= 50; i++) {
                // Check if the current number is a multiple of 5
                if (i % 5 == 0) {
                    continue;
                }
                System.out.println(i);
            }
        }
    }


