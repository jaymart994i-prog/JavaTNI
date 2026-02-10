package CoffeeShop;

public class Frappuccino extends Drink {
    private boolean whipped;

    public Frappuccino(String size, boolean whipped) {
        super("Frappuccino", 40, size);
        this.whipped = whipped;
    }

    @Override
    public double calculateFinalPrice() {
        double whippedPrice = 0;
        if (whipped) {
            whippedPrice = 15;
        }
        return getBasePrice() + whippedPrice + getSizeExtra();
    }

    @Override
    public String toString() {
        String message = super.toString();
        if (whipped) {
            message += "\nAdd whipped 15 Baht";
        }
        message += "\nTotal price = " + calculateFinalPrice() + " Baht";
        return message;
    }
}