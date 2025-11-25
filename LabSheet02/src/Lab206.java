import javax.swing.*;
import java.text.DecimalFormat;

public class Lab206 {
    public static void main(String[] args) {
        final double Customer_PRICE = 299;

        double Customer = Integer.parseInt(JOptionPane.showInputDialog("How many customer?"));
        final double Total_Customer_Price = Customer_PRICE * Customer;
        final double Net = 0.07;
        final double Total_Net_Price = Total_Customer_Price + (Total_Customer_Price * Net);

        double Discount = Integer.parseInt(JOptionPane.showInputDialog("Price with NET is " + Total_Net_Price +
        "\nHow much of discount (%) on your coupon?"));
        DecimalFormat df = new DecimalFormat("0.00");
        final double Total =  Total_Net_Price - (Total_Net_Price * Discount/100);

        double Customer_paid = Integer.parseInt(JOptionPane.showInputDialog("Total price is " + df.format(Total) + " bath." +
                "\nEnter the amount the customer paid:"));

        JOptionPane.showMessageDialog(null,
                "Total price is " + df.format(Total) + " baht." +
                "\nCustomer paid " + df.format(Customer_paid) + " baht." +
                "\nGet change " + df.format((Customer_paid - Total)) + " baht.");
    }
}
