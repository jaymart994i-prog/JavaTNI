package CoffeeShop;

public class Espresso extends Drink {
    private int shot;

    public Espresso(String size) {
        super("Espresso", 35, size);
        this.shot = 0;
    }

    public void addShot(int shot) {
        this.shot += shot;
    }

    public int getShot() {
        return shot;
    }

    @Override
    public double calculateFinalPrice() {
        return getBasePrice() + (shot * 15) + getSizeExtra();
    }

    @Override
    public String toString() {
        String message = super.toString();
        if (shot > 0) {
            message += "\nAdded " + shot + " shot";
        }
        message += "\nTotal price = " + calculateFinalPrice() + " Baht";
        return message;
    }
}


