import java.util.Scanner;
public class CountEvenOddZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int evenCount = 0;
        int oddCount = 0;
        int zeroCount = 0;

        System.out.println("Enter 10 values:");

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter value " + i + ": ");
            int value = scanner.nextInt();

            if (value % 2 == 0) {
                evenCount++;
            } else if (value != 0) {
                oddCount++;
            } else {
                zeroCount++;
            }
        }

        System.out.println("Number of even values: " + evenCount);
        System.out.println("Number of odd values: " + oddCount);
        System.out.println("Number of zero values: " + zeroCount);
    }
}
