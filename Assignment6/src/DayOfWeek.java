import java.util.Scanner;

public class DayOfWeek {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number (1-7) to get the corresponding day of the week: ");
            int dayNumber = scanner.nextInt();
            String dayName;
            switch (dayNumber) {
                case 1:
                    dayName = "Monday";
                    break;
                case 2:
                    dayName = "Tuesday";
                    break;
                case 3:
                    dayName = "Wednesday";
                    break;
                case 4:
                    dayName = "Thursday";
                    break;
                case 5:
                    dayName = "Friday";
                    break;
                case 6:
                    dayName = "Saturday";
                    break;
                case 7:
                    dayName = "Sunday";
                    break;
                default:
                    dayName = "Invalid input. Please enter a number between 1 and 7.";
                    break;
            }
            System.out.println(dayName);
            scanner.close();
        }
    }


