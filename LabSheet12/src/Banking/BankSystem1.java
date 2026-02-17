package Banking;

import java.util.Scanner;

public class BankSystem1 {

    public static String input_account_id() {
        Scanner sc = new Scanner(System.in);
        String id = "";
        while (true) {
            System.out.print("Enter account id: ");
            id = sc.nextLine();
            if (id.length() == 10) {
                break;
            }
        }
        return id;
    }

    public static double input_initial_balance() {
        Scanner sc = new Scanner(System.in);
        double balance = 0.0;
        while (true) {
            try {
                System.out.print("Enter your initial deposit amount: ");
                String input = sc.nextLine();
                balance = Double.parseDouble(input);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Try again!!");
            }
        }
        return balance;
    }

    public static void main(String[] args) {
        String account_bank = input_account_id();
        double initial_balance = input_initial_balance();

        OpenNewAccount account = new OpenNewAccount(account_bank, initial_balance);
        System.out.println(account.recordAccount());
    }
}