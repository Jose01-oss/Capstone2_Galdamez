package org.example;

import java.util.ArrayList;

public class Order {

    private ArrayList<Pizza> pizzas = new ArrayList<>();
    private ArrayList<Drink> drinks = new ArrayList<>();
    private ArrayList<GarlicKnots> garlicKnots = new ArrayList<>();

    public void addPizza(Pizza pizza) {
        pizzas.add(pizza);
    }
    public void addDrink(Drink drink) {
        drinks.add(drink);
    }
    public void addGarlicKnots(GarlicKnots garlicKnots) {
        this.garlicKnots.add(garlicKnots);
    }
}
