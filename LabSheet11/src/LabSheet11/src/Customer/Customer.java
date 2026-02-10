package Customer;

public abstract class Customer {
    private String name;
    private double billAmount;

    public Customer(String name,double billAmount){
        this.name = name;
        this.billAmount = billAmount;
    }

    protected Customer() {
    }

    public double getBillAmount() {
        return this.billAmount;
    }
    public abstract double calculateFinalBill();

    public String toString(){
        return "Customer: " + name +
                "\nBill amount: " + billAmount;
    }
}
