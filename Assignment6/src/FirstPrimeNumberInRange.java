public class FirstPrimeNumberInRange {
    public static void main(String[] args) {
        int start = 1;
        int end = 100;
        int firstPrime = -1;
        for (int num = start; num <= end; num++) {
            if (isPrime(num)) {
                firstPrime = num;
                break;
            }
        }
        if (firstPrime != -1) {
            System.out.println("The first prime number in the range is: " + firstPrime);
        } else {
            System.out.println("No prime number found in the range.");
        }
    }

    public static boolean isPrime(int number) {
        // Handle edge cases
        if (number <= 1) return false;
        if (number == 2) return true;
        if (number % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) return false;
        }

        return true;
    }
}





