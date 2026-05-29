package org.example;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private List<Pizza> pizzas;
    private List<Drink> drinks;
    private List<GarlicKnots> garlicKnots;
    private double totalCost;

    public Order(List<Pizza> pizzas, List<Drink> drinks, List<GarlicKnots> garlicKnots, double totalCost) {
        this.pizzas = pizzas;
        this.drinks = drinks;
        this.garlicKnots = garlicKnots;
        this.totalCost = totalCost;
    }

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


    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public List<Drink> getDrinks() {
        return drinks;
    }

    public List<GarlicKnots> getGarlicKnots() {
        return garlicKnots;
    }
}
