import java.util.Scanner;

public class Ex304 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a message: ");
        String message = scanner.nextLine();

        System.out.print("How many loop : ");
        int loop = scanner.nextInt();

        for (int i=1; i <= loop; i++) {
            System.out.println(message);
        }

    }
}
