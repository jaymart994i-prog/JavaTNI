
import java.util.Scanner;

public class InventoryMain {
    public static void showInfo(Inventory product) {
        System.out.println("Product Name : " + product.getName());
        System.out.println("Current Stock : " + product.getStock());
        System.out.println("------------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Inventory product1 = new Inventory("Pen", 10);

        while (true) {
            showInfo(product1);

            System.out.println("Press 1 to add item in stock");
            System.out.println("Press 2 to remove item from stock");
            System.out.println("Enter a menu");
            int menu = sc.nextInt();

            if (menu == 1) {
                System.out.println("How many item to add in stock: ");
                product1.addStock(sc.nextInt());
            }
            else if (menu == 2) {
                System.out.println("How many item to remove from stock: ");
                product1.removeStock(sc.nextInt());
            }
            else {
                //System.out.println("END PROGRAM");
                break;
            }
        }

        System.out.println("END PROGRAM");
    }
}
