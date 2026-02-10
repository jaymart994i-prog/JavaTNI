package CoffeeShop;

public abstract class Drink implements Priceable{
    private String drinkName;
    private double basePrice;
    private String size;

    public Drink(String drinkName,double basePrice,String size){
        this.drinkName = drinkName;
        this.basePrice = basePrice;
        this.size = size;
    }

    protected Drink() {
    }

    public String getDrinkName(){
        return this.drinkName;
    }
    public abstract double calculateFinalPrice();

    @Override
    public double getBasePrice() {
        return basePrice;
    }

    @Override
    public double getSizeExtra() {
        if (size.equalsIgnoreCase("S"))
            return 0;
        if (size.equalsIgnoreCase("M"))
            return 10;
        if (size.equalsIgnoreCase("L"))
            return 15;
        return -1;
    }
    public String toString(){
        return "Your order: " + drinkName + "(Size: " + size;
    }
}

