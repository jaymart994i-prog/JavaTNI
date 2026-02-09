import java.util.Scanner;

public class CakeOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //No.1
        System.out.println("Birth Cake's Detail:");
        System.out.print("Enter a message on cake: ");
        String message = scanner.nextLine();
        System.out.print("Enter a flavor : ");
        String flavor = scanner.next();
        System.out.print("How many pounds: ");
        double pound = scanner.nextDouble();

        //No.2
        BrithdayCake order1 = new BrithdayCake(message, pound,flavor, 350);

        //No.3
        System.out.println(order1);

        //No.4
        System.out.println("\nCup Cake's Detail:");
        System.out.print("Enter a flavor : ");
        String cup_flavor = scanner.next();
        System.out.print("How many price : ");
        int piece = scanner.nextInt();

        //No.5
        CupCake order2 = new CupCake(piece,cup_flavor,65);

        //No.6
        System.out.println(order2);

        System.out.println("\nPie's Details:");
        System.out.print("Enter a flavor: ");
        String Pie = scanner.next();
        String flavor3 = scanner.nextLine();
        System.out.print("Enter filling type: ");
        String filling = scanner.nextLine();
        System.out.println("Select extra topping:");
        System.out.println("1. Whipped Cream");
        System.out.println("2. Vanilla Ice Cream");
        System.out.println("3. Cheddar Cheese");
        System.out.print("Enter choice: ");
        int topChoice = scanner.nextInt();

        Pie order3 = new Pie(filling, flavor3, 120);
        order3.selectTopping(topChoice);

        System.out.println(order3);



        //No.7
        System.out.print("\nTotal price = " +
                (order1.getUnitPrice() * pound + order2.getUnitPrice() * piece + order3.getUnitPrice() + order3.getPackingCost()));




    }
}
