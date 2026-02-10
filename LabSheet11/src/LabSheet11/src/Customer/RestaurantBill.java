package Customer;

import javax.swing.*;

public class RestaurantBill {
    public static void main(String[] args) {
        //No.1
        String customer_name = JOptionPane.showInputDialog("Enter customer's name:");

        //No.2
        double bill_amount = Double.parseDouble(
                JOptionPane.showInputDialog("Enter customer's bill:"));

        //No.3
        int is_member = JOptionPane.showConfirmDialog(null,
                "Do you have a member card?",
                "Member", JOptionPane.YES_OPTION);

        //No.3-a
        if (is_member == JOptionPane.YES_OPTION) { //if (is_member ==0)
        //String member_level = JOptionPane.showInputDialog("Enter a member level (Gold / Premium");
        //Member bill = new Member(customer_name,)

        } else { //No.3-b
            Regular bill = new Regular(customer_name, bill_amount);
            JOptionPane.showMessageDialog(null, bill);
        }
    }
}