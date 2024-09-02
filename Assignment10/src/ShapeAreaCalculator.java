import java.util.Scanner;
public class ShapeAreaCalculator {
        public static double calculateArea(double radius) {
            return Math.PI * radius * radius;
        }
        public static double calculateArea(double length, double width) {
            return length * width;
        }
        public static double calculate(double base, double height) {
            return 0.5 * base * height;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Choose a shape to calculate the area:");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Triangle");
            System.out.print("Enter the number corresponding to your choice: ");
            int choice = scanner.nextInt();

            double area = 0.0;

            switch (choice) {
                case 1: // Circle
                    System.out.print("Enter the radius of the circle: ");
                    double radius = scanner.nextDouble();
                    area = calculateArea(radius);
                    break;
                case 2: // Rectangle
                    System.out.print("Enter the length of the rectangle: ");
                    double length = scanner.nextDouble();
                    System.out.print("Enter the width of the rectangle: ");
                    double width = scanner.nextDouble();
                    area = calculateArea(length, width);
                    break;
                case 3: // Triangle
                    System.out.print("Enter the base of the triangle: ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter the height of the triangle: ");
                    double height = scanner.nextDouble();
                    area = calculateArea(base, height);
                    break;
                default:
                    System.out.println("Invalid choice.");
                    return;
            }

            System.out.printf("The area is: %.2f\n", area);
        }
    }


