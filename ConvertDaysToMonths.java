import java.util.Scanner;
public class ConvertDaysToMonths {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of days: ");
        float days = scanner.nextFloat();
        float months = days / 30;
        float remainingDays = days % 30;

        System.out.println(days + " days is approximately equal to:");
        System.out.println("Months: " + months);
        System.out.println("Remaining Days: " + remainingDays);
    }
}
