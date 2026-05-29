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

    public double getTotalPrice(){
        double PizzaPrice = pizzas.stream().mapToDouble(Pizza::calculatePrice  ).sum();

        double drinkPrice = drinks.stream().mapToDouble(Drink::getPrice).sum();

        double knotsPrice = garlicKnots.stream().mapToDouble(GarlicKnots::getPrice).sum();

        return PizzaPrice + drinkPrice + knotsPrice;
    }


    public ArrayList<Pizza> getPizzas() {
        return pizzas;
    }

    public ArrayList<Drink> getDrinks() {
        return drinks;
    }

    public ArrayList<GarlicKnots> getGarlicKnots() {
        return garlicKnots;
    }
}
