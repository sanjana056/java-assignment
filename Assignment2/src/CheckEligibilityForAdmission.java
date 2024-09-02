import java.util.Scanner;
public class CheckEligibilityForAdmission {

        public static void main(String[] args) {
            // Create a Scanner object to read input
            Scanner scanner = new Scanner(System.in);

             // enter the marks
            System.out.print("Input the marks obtained in Physics: ");
            int physics = scanner.nextInt();
            System.out.print("Input the marks obtained in Chemistry: ");
            int chemistry = scanner.nextInt();
            System.out.print("Input the marks obtained in Mathematics: ");
            int maths = scanner.nextInt();
            System.out.print("Total marks of Maths, Physics, and Chemistry: ");
            int totalMarks = scanner.nextInt();
            System.out.print("Total marks of Maths and Physics: ");
            int totalMathsPhysics = scanner.nextInt();

            // eligibility based on the criteria
            if (maths >= 65 && physics >= 55 && chemistry >= 50) {
                if (totalMarks >= 190 || totalMathsPhysics >= 140) {
                    System.out.println("The candidate is eligible for admission.");
                } else {
                    System.out.println("The candidate is not eligible for admission.");
                }
            } else {
                System.out.println("The candidate is not eligible for admission.");
            }
            scanner.close();
        }
    }


