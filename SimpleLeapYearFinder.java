import java.util.Scanner;
public class SimpleLeapYearFinder {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int startYear;
        do {
            System.out.print("Enter the starting year (above 1000): ");
            startYear = scanner.nextInt();
        } while (startYear <= 1000);

        System.out.print("Enter the ending year: ");
        int endYear = scanner.nextInt();

        System.out.println("Leap years between " + startYear + " and " + endYear + ":");

        for (int year = startYear; year <= endYear; year++) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year);
            }
        }
    }
}
