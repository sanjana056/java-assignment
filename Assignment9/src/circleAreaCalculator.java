import java.util.Scanner;
public class circleAreaCalculator {
        public static double calculateArea(double radius) {
            return Math.PI * radius * radius;
        }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the radius of the circle: ");
            double radius = scanner.nextDouble();
            double area = calculateArea(radius);
            System.out.print("The area of the  circle is :" + area);
            scanner.close();
        }
    }

