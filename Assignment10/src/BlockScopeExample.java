public class BlockScopeExample {
        public static void calculate() {
            int x = 10;
            System.out.println("Value of x outside the loop: " + x);
            for (int i = 0; i < 3; i++) {
                int y = i * 5;
                System.out.println("Value of x inside the loop: " + x);
            }

            System.out.println("Value of x outside the loop after the loop ends: " + x);
        }

        public static void main(String[] args) {
            calculate();
        }
    }


