import javax.swing.JOptionPane;

public class CakeOrder3 {
    public static void main(String[] args) {

        String poundStr = JOptionPane.showInputDialog("How many pounds do you want?");
        if (poundStr == null) return;
        double pound = Double.parseDouble(poundStr);

        String flavor = JOptionPane.showInputDialog("Enter a flavor birthday cake:");
        if (flavor == null) return;

        String message = JOptionPane.showInputDialog("Enter a message on cake:");
        if (message == null) return;

        BrithdayCake order = new BrithdayCake(message, pound, flavor, 400);

        while (true) {
            String info = "Thank you for your order!\n" +
                    order.getFlavor() + " birthday cake (message=" + order.getMessage() + ")\n" +
                    "Total price of Birthday Cake = " + order.calculateTotalPrice() + "\n\n" +
                    "Confirm this order?";

            int choice = JOptionPane.showConfirmDialog(null, info, "Confirm Order", JOptionPane.YES_NO_CANCEL_OPTION);

            if (choice == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null,
                        "Thank you for your order!\n" +
                                order.getFlavor() + " birthday cake (message=" + order.getMessage() + ")\n" +
                                "Total price of Birthday Cake = " + order.calculateTotalPrice());
                break;

            } else if (choice == JOptionPane.NO_OPTION || choice == JOptionPane.CANCEL_OPTION) {
                String newMessage = JOptionPane.showInputDialog("Enter a new message for changing:");

                if (newMessage != null) {
                    order.changeMessage(newMessage);
                }
            } else {
                break;
            }
        }
    }
}