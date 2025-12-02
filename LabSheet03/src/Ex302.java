import java.util.Scanner;

public class Ex302 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter mid-term score: ");
        int midterm = scanner.nextInt();

        System.out.print("Enter final    score: ");
        int Final = scanner.nextInt();

        int total_score = midterm + Final;

        if (total_score > 100 || total_score < 0) {
            System.out.print("Error score!!");
        } else {
            System.out.print("Your score is " + total_score);
            if (total_score >= 80) {
                System.out.println("\nYou get grade A");
            } else if (total_score >= 70) {
                System.out.println("\nYou get grade B");
            } else if (total_score >= 60) {
                System.out.println("\nYou get grade C");
            } else if (total_score >= 50) {
                System.out.println("\nYou get grade D");
            } else {
                System.out.println("\nYou get grade F");


            }

        }
    }
}

