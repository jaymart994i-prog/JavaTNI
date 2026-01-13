import java.util.Scanner;

public class ProductMain2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Product product1 = new Product();
        product1.name = "Pens";
        product1.price = 10.5;
        product1.quantity = 50;

        Product product2 = new Product();
        product2.name = "Notebooks";
        product2.price = 25.75;
        product2.quantity = 20;

        System.out.println("Welcome to Mini Shop");
        System.out.println("--------------------");
        System.out.println("Press [1] to buy Pen");
        System.out.println("Press [2] to buy Notebook");

        int choice;
        System.out.print("Enter a number: ");
        while (true) {
            choice = scanner.nextInt();
            if (choice == 1 || choice == 2) {
                break;
            }
            System.out.print("Invalid number! Enter a number, again: ");
        }

        if (choice == 1) {
            product1.showInfo();
            System.out.print("--------------------------------\nHow many Pens do you want to buy? ");
            int amount = scanner.nextInt();
            product1.sell(amount);
            System.out.println("--------------------------------");
            product1.showInfo();
        } else {
            product2.showInfo();
            System.out.print("--------------------------------\nHow many Notebooks do you want to buy? ");
            int amount = scanner.nextInt();
            product2.sell(amount);
            System.out.println("--------------------------------");
            product2.showInfo();
        }

        scanner.close();
    }
}