import java.util.Scanner;

public class Lab305 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int startNum = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int endNum = scanner.nextInt();

        for (int i = startNum; i <= endNum; i++) {

            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        scanner.close();
    }
}