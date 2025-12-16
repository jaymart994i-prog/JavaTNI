import java.util.Scanner;

public class Lab506 {

    public static boolean is_prime_number(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;

        while (true) {
            System.out.print("Enter number (> 1): ");
            number = sc.nextInt();
            if (number > 1) {
                break;
            }
            System.out.println("Number must be greater than 1.");
        }

        if (is_prime_number(number)) {
            System.out.println(number + " is Prime Number");
        } else {
            System.out.println(number + " is Not Prime Number");
        }

        sc.close();
    }
}