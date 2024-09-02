public class Assign4 {
        public static void main(String[] args) {
            // Loop through numbers from 1 to 50
            for (int i = 1; i <= 50; i++) {
                // Check if the current number is a multiple of 5
                if (i % 5 == 0) {
                    // Skip the current iteration if it is a multiple of 5
                    continue;
                }
                // Print the number if it is not a multiple of 5
                System.out.println(i);
            }
        }
    }


