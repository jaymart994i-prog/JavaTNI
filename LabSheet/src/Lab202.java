import java.util.Scanner;

public class Lab202 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number 1 : ");
        int number1 = scanner.nextInt();
        System.out.print("Enter number 2 : ");
        int number2 = scanner.nextInt();

        System.out.println("\nSummation = " + (number1 + number2));
        System.out.println("Subtraction = " + (number1 - number2));
        System.out.println("Multiplication = " + (number1 * number2));
        System.out.println("Division = " + (float) number1 / number2);
        System.out.println("Modulus = " + (number1 % number2));
    }
}
