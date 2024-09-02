public class ScopeExample {
        public static int sum(int a, int b) {
            return a + b;
        }
        public static int multiply(int a, int b) {
            return a * b;
        }

        public static void main(String[] args) {
            int result = sum(5, 3);
            System.out.println("The sum is: " + result);
        }
    }


