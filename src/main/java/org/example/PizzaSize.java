package org.example;

public enum PizzaSize {

    Small("8\"" , 8.50),
    Medium("12\"" , 12.00),
    Large("16\"" , 16.50);

    private String size;
    private double basePrice;

    PizzaSize(String size, double basePrice) {
        this.size = size;
        this.basePrice = basePrice;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }
}
