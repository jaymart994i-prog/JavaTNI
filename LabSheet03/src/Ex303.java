import java.util.Scanner;

public class Ex303 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter number 3: ");
        int num3 = scanner.nextInt();

        // condition? TRUE : FALSE
        System.out.println(num1 == num2 && num2 == num3 ? "All number are th same." : "All numbers are NOT the same");

    }
}
