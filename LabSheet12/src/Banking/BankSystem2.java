package Banking;

import java.util.Scanner;

public class BankSystem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your bank account: ");
        String accId = sc.nextLine();

        AccountTransaction account = new AccountTransaction(accId);

        if (account.hasAccountId()) {
            boolean exit = false;
            while (!exit) {
                System.out.println("\nPress 1 to deposit");
                System.out.println("Press 2 to withdraw");
                System.out.println("Press 3 to check balance");
                System.out.println("Press 4 to exit");

                System.out.print("\nEnter a menu: ");
                String choice = sc.nextLine();
                int menu = 0;
                try {
                    menu = Integer.parseInt(choice);
                } catch (NumberFormatException e) {
                    continue;
                }

                switch (menu) {
                    case 1:
                        System.out.print("Enter amount to deposit: ");
                        double depAmount = Double.parseDouble(sc.nextLine());
                        account.deposit(depAmount);
                        System.out.println("Your balance = " + account.checkBalance());
                        break;

                    case 2:
                        System.out.print("Enter amount to withdraw: ");
                        double widAmount = Double.parseDouble(sc.nextLine());
                        account.withdraw(widAmount);
                        System.out.println("Your balance = " + account.checkBalance());
                        break;

                    case 3:
                        System.out.println("Your balance = " + account.checkBalance());
                        break;

                    case 4:
                        exit = true;
                        break;

                    default:
                        break;
                }
            }
        } else {
            System.out.println("Bank account not found...");
        }
    }
}