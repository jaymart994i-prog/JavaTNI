package CoffeeShop;

import java.util.Scanner;

public class CoffeeShop {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int espressoCount = 0;
        int frappuccinoCount = 0;
        double grandTotal = 0;
        boolean continueOrder = true;

        while (continueOrder) {
            System.out.println("Press 1 for ordering Espresso");
            System.out.println("Press 2 for ordering Frappuccino");
            System.out.print("Enter an option: ");
            int option = scan.nextInt();

            if (option == 1) {
                Espresso order = orderEspresso();
                System.out.println(order.toString());
                grandTotal += order.calculateFinalPrice();
                espressoCount++;
            } else if (option == 2) {
                Frappuccino order = orderFrappucino();
                System.out.println(order.toString());
                grandTotal += order.calculateFinalPrice();
                frappuccinoCount++;
            } else {
                break;
            }

            System.out.print("Do you want to order more [y/Y]? ");
            String more = scan.next();
            if (!more.equalsIgnoreCase("y")) {
                continueOrder = false;
            }
        }

        System.out.println("You ordered " + espressoCount + " Espresso");
        System.out.println("You ordered " + frappuccinoCount + " Frappuccino");
        System.out.println("Total Price = " + grandTotal);
    }

    public static Espresso orderEspresso() {
        System.out.print("Enter a size: ");
        String size = scan.next();
        Espresso es = new Espresso(size);

        System.out.print("Press 'y' or 'Y' for adding a shot: ");
        String choice = scan.next();
        if (choice.equalsIgnoreCase("y")) {
            System.out.print("How many shots for adding in Espresso: ");
            int shots = scan.nextInt();
            es.addShot(shots);
        }
        return es;
    }

    public static Frappuccino orderFrappucino() {
        System.out.print("Enter a size: ");
        String size = scan.next();

        System.out.print("Do you would like to add whipped cream [y/Y]? ");
        String choice = scan.next();
        boolean whipped = choice.equalsIgnoreCase("y");

        return new Frappuccino(size, whipped);
    }
}