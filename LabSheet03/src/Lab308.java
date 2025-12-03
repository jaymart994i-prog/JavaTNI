import java.util.Scanner;

public class Lab308 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Ask how many numbers the user wants to input
        System.out.print("How many number to input: ");
        int count = scanner.nextInt();

        // Variables to store our stats
        // We initialize max to the smallest possible integer and min to the largest
        // so that the first number entered will automatically update them.
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int evenCount = 0;
        int oddCount = 0;

        // 2. Loop to get the numbers
        for (int i = 1; i <= count; i++) {
            System.out.print("Enter number " + i + ": ");
            int currentNum = scanner.nextInt();

            // Check for Maximum
            if (currentNum > max) {
                max = currentNum;
            }

            // Check for Minimum
            if (currentNum < min) {
                min = currentNum;
            }

            // Check for Even or Odd
            if (currentNum % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        // 3. Display the final results
        System.out.println(); // Empty line for formatting
        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
        System.out.println("Even number = " + evenCount);
        System.out.println("Odd number = " + oddCount);

        scanner.close();
    }
}