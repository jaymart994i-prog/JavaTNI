import java.util.Scanner;

public class Lab204 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("input hour : ");
        int hour = scanner.nextInt();

        System.out.println("Input minute : ");
        int minute = scanner.nextInt();

        System.out.println("total time is " + (hour*60 + minute) + " minutes");

    }
}
