package ui;

public class Movie extends Media implements ItemAction {
    private double rentPrice;
    private double buyPrice;

    public Movie(String id, String title, double rentPrice, double buyPrice) {
        super(id, title);
        this.rentPrice = rentPrice;
        this.buyPrice = buyPrice;
    }

    public double getRentPrice() {
        return rentPrice;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public String showDetail() {
        return "ID: " + getId() + " | Title: " + getTitle() + " | Status: " + getStatus();
    }

    public boolean rentItem() {
        if (getStatus().equals("Available")) {
            setStatus("Rented");
            return true;
        }
        return false;
    }

    public boolean returnItem() {
        if (getStatus().equals("Rented")) {
            setStatus("Available");
            return true;
        }
        return false;
    }

    public boolean buyItem() {
        if (getStatus().equals("Available")) {
            setStatus("Sold");
            return true;
        }
        return false;
    }
}