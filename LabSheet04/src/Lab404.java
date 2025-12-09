import java.util.Scanner;

public class Lab404 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String result = "";

        while (true) {
            System.out.print("Enter word: ");
            String word = scan.next();

            if (word.equalsIgnoreCase("stop")) {
                break;
            }

            if (result.equals("")) {
                result += word;
            } else {
                result += " " + word;
            }
        }

        System.out.println(result);

        scan.close();
    }
}