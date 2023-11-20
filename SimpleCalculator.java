import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        float a = scanner.nextFloat();

        System.out.print("Enter the second number: ");
        float b = scanner.nextFloat();

        System.out.println("Choose an operation:");
        System.out.println("1 : Addition");
        System.out.println("2 : Subtraction");
        System.out.println("3 : Multiplication");
        System.out.println("4 : Division");
        System.out.println("5 : Modulo");
        System.out.print("Enter the operation (1-5): ");
        int operation = scanner.nextInt();

        float result = 0;

        switch (operation) {
            case 1:
                result = a + b;
                break;
            case 2:
                result = a - b;
                break;
            case 3:
                result = a * b;
                break;
            case 4:
                if (b != 0) {
                    result = a / b;
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                    return;
                }
                break;
            case 5:
                if (b != 0) {
                    result = a % b;
                } else {
                    System.out.println("Error: Cannot calculate modulo with zero.");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operation. Please choose a number between 1 and 5.");
                return;
        }
        System.out.println("Result: " + result);
    }
}
