public class Assign10 {
        public static void main(String[] args) {
            int lowerBound = 1;
            int upperBound = 100;
            for (int num = lowerBound; num <= upperBound; num++) {
                if (isPrime(num)) {
                    System.out.println("The first prime number in the range is: " + num);
                    break;
                }
            }
        }
        public static boolean isPrime(int number) {
            if (number <= 1) {
                return false;
            }
            if (number <= 3) {
                return true;
            }
            if (number % 2 == 0 || number % 3 == 0) {
                return false;
            }
            for (int i = 5; i * i <= number; i += 6) {
                if (number % i == 0 || number % (i + 2) == 0) {
                    return false;
                }
            }

            return true;
        }
    }


