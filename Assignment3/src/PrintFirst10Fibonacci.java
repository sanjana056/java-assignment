public class PrintFirst10Fibonacci {

        public static void main(String[] args) {
            int count = 0;
            int first = 0;
            int second = 1;
            System.out.println("First 10 Fibonacci numbers:");

            while (count < 10) {

                System.out.print(first + " ");
                int next = first + second;
                first = second;
                second = next;

                count++;
            }
        }
    }


