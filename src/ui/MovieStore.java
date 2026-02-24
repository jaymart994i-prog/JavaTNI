package ui;

public class MovieStore {
    private Media[] items;
    private int itemCount;

    public MovieStore(int maxSize) {
        items = new Media[maxSize];
        itemCount = 0;
    }

    public void addItem(Media item) {
        if (itemCount < items.length) {
            items[itemCount++] = item;
        }
    }

    public Media[] getItems() {
        return items;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void showAllMovies() {
        System.out.println("\n--- All Movies ---");
        for (int i = 0; i < itemCount; i++) {
            System.out.println(items[i].showDetail());
        }
    }

    public void processRent(String id) {
        for (int i = 0; i < itemCount; i++) {
            if (items[i].getId().equals(id) && items[i] instanceof Movie) {
                if (((Movie) items[i]).rentItem()) {
                    System.out.println("Rent successful!");
                } else {
                    System.out.println("Cannot rent (Movie not available).");
                }
                return;
            }
        }
        System.out.println("Movie ID not found.");
    }

    public void processReturn(String id) {
        for (int i = 0; i < itemCount; i++) {
            if (items[i].getId().equals(id) && items[i] instanceof Movie) {
                if (((Movie) items[i]).returnItem()) {
                    System.out.println("Return successful!");
                } else {
                    System.out.println("This movie was not rented.");
                }
                return;
            }
        }
        System.out.println("Movie ID not found.");
    }

    public void processBuy(String id) {
        for (int i = 0; i < itemCount; i++) {
            if (items[i].getId().equals(id) && items[i] instanceof Movie) {
                if (((Movie) items[i]).buyItem()) {
                    System.out.println("Purchase successful!");
                } else {
                    System.out.println("Cannot buy this movie.");
                }
                return;
            }
        }
        System.out.println("Movie ID not found.");
    }

    public void showMovieStatus(String id) {
        for (int i = 0; i < itemCount; i++) {
            if (items[i].getId().equals(id)) {
                System.out.println("Current Status: " + items[i].getStatus());
                return;
            }
        }
        System.out.println("Movie not found.");
    }
}