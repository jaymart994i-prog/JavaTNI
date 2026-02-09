class Pie extends Bakery {
    private String fillingType;
    private String topping = "Original";

    public Pie(String fillingType, String flavor, double unitPrice) {
        super(flavor, unitPrice);
        this.fillingType = fillingType;
    }

    public void selectTopping(int choice) {
        switch (choice) {
            case 1:
                this.topping = "Whipped Cream";
                break;
            case 2:
                this.topping = "Vanilla Ice Cream";
                break;
            case 3:
                this.topping = "Cheddar Cheese";
                break;
            default:
                this.topping = "Original";
                break;
        }
    }

    @Override
    public int getPackingCost() {
        if (this.topping == "Original") {
            return 8;
        } else {
            return 15;
        }
    }

    @Override
    public double calculateTotalPrice() {
        return getUnitPrice() + getPackingCost();
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                getFlavor() + " Pie (Filling: " + fillingType + ")\n" +
                "Topping: " + topping + "\n" +
                "Total price of Pie = " + calculateTotalPrice();
    }
}