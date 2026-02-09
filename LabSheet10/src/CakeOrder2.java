import java.util.Scanner;

public class CakeOrder2 {

    public static String selectFlavor(Scanner scan) {
        String[] flavors = {"Chocolate", "Vanilla", "Strawberry", "Lemon", "Red Velvet"};
        int choice = 0;

        while (true) {
            System.out.println("Press 1 for Chocolate");
            System.out.println("Press 2 for Vanilla");
            System.out.println("Press 3 for Strawberry");
            System.out.println("Press 4 for Lemon");
            System.out.println("Press 5 for Red Velvet");
            System.out.print("Enter a flavor number: ");

            if (scan.hasNextInt()) {
                choice = scan.nextInt();
                if (choice >= 1 && choice <= 5) {
                    return flavors[choice - 1];
                }
            } else {
                scan.next();
            }

            System.out.println("Invalid flavor! Please try again.\n");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Press 1 to order Birthday Cake");
        System.out.println("Press 2 to order Cup Cake");
        System.out.println("Press 3 to order Pie");
        System.out.print("Enter an option: ");

        int option = scan.nextInt();

        if (option == 1) {
            String flavor = selectFlavor(scan);
            scan.nextLine();

            System.out.print("Enter a message: ");
            String message = scan.nextLine();

            System.out.print("How many pounds: ");
            double pound = scan.nextDouble();

            BrithdayCake order1 = new BrithdayCake(message, pound, flavor, 350);
            System.out.println(order1.toString());

        } else if (option == 2) {
            String flavor = selectFlavor(scan);

            System.out.print("How many pieces: ");
            int piece = scan.nextInt();

            CupCake order2 = new CupCake(piece, flavor, 70);
            System.out.println(order2.toString());

        } else if (option == 3) {
            String flavor = selectFlavor(scan);
            scan.nextLine();

            System.out.print("Enter filling type: ");
            String filling = scan.nextLine();

            Pie order3 = new Pie(filling, flavor, 120);

            System.out.println("Select extra topping:");
            System.out.println("1. Whipped Cream");
            System.out.println("2. Vanilla Ice Cream");
            System.out.println("3. Cheddar Cheese");
            System.out.print("Enter choice: ");
            int topChoice = scan.nextInt();

            order3.selectTopping(topChoice);

            System.out.println(order3.toString());

        } else {
            System.out.println("Wrong option!! Try again!!");
        }

        scan.close();
    }
}