package org.example;

public class GarlicKnots {

    private int quantity;
    private final double price = 1.50;


    public GarlicKnots(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price * quantity;
    }
}
