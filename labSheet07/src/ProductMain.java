import javax.swing.JOptionPane;

public class ProductMain {
    public static void main(String[] args) {
        Product product = new Product();

        JOptionPane.showMessageDialog(null, "Welcome to Product Stock System");
        product.name = JOptionPane.showInputDialog("Enter product name:");
        product.price = Double.parseDouble(JOptionPane.showInputDialog("Enter product price per item:"));
        product.quantity = Integer.parseInt(JOptionPane.showInputDialog("Enter product stock:"));
        product.showInfo();

        int addStockChoice = JOptionPane.showConfirmDialog(null, "Do you want to add more item?", "Select an Option", JOptionPane.YES_NO_CANCEL_OPTION);
        if (addStockChoice == JOptionPane.YES_OPTION) {
            int amount = Integer.parseInt(JOptionPane.showInputDialog("How many items to add in stock?"));
            product.addStock(amount);
            int changePriceChoice = JOptionPane.showConfirmDialog(null, "Do you want to change price?", "Select an Option", JOptionPane.YES_NO_CANCEL_OPTION);
            if (changePriceChoice == JOptionPane.YES_OPTION) {
                double newPrice = Double.parseDouble(JOptionPane.showInputDialog("How much is the new price per item?"));
                product.changePrice(newPrice);
                product.showInfo();
          }
        }
    }
}