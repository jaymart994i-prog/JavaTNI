import javax.swing.*;

public class Lab206 {
    public static void main(String[] args) {
        final double Customer_PRICE = 299;

        float customer = Integer.parseInt(JOptionPane.showInputDialog("How many customer?"));
        float discount = Integer.parseInt(JOptionPane.showInputDialog("Price with NET is " + (customer*Customer_PRICE + (customer*Customer_PRICE * 7/100))) +
        "\nHow much of discount(%) on your coupon?");
        float Total_price = Integer.parseInt(JOptionPane.showInputDialog("Total price is " + (discount)));

    }
}
