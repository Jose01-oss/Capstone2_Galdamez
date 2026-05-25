package org.example;

public class Drink {
   private DrinkSize size;
   private String name;

    public Drink(DrinkSize size, String name) {
        this.size = size;
        this.name = name;
    }

    public DrinkSize getSize() {
        return size;
    }

    public void setSize(DrinkSize size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return size.getPrice();
    }
    @Override
    public String toString() {
        return size + " " + name + "$" + String.format("%.2f", getPrice());
    }
}
