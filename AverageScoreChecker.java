import java.util.Scanner;
public class AverageScoreChecker {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the score for subject 1: ");
        double subject1 = scanner.nextDouble();

        System.out.print("Enter the score for subject 2: ");
        double subject2 = scanner.nextDouble();

        System.out.print("Enter the score for subject 3: ");
        double subject3 = scanner.nextDouble();

        double average = (subject1 + subject2 + subject3) / 3;
 
		if (average > 50) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}
