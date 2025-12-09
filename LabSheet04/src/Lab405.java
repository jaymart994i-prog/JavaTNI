import java.util.Scanner;

public class Lab405 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Input some sentence: ");
        String sentence = scan.nextLine();

        while (!sentence.endsWith(".")) {
            System.out.print("The sentence must end with full stop point:");
            sentence = scan.nextLine();

        }

        String[] words = sentence.split(" ");

        for (String word : words) {
            System.out.println(word);
        }

        scan.close();
    }
}