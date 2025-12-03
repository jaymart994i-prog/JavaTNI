import java.util.Scanner;

public class Lab308 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many number to input: ");
        int count = scanner.nextInt();

    
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int evenCount = 0;
        int oddCount = 0;

        
        for (int i = 1; i <= count; i++) {
            System.out.print("Enter number " + i + ": ");
            int currentNum = scanner.nextInt();

            
            if (currentNum > max) {
                max = currentNum;
            }

            
            if (currentNum < min) {
                min = currentNum;
            }

        
            if (currentNum % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println(); // Empty line for formatting
        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
        System.out.println("Even number = " + evenCount);
        System.out.println("Odd number = " + oddCount);

        scanner.close();
    }

}
