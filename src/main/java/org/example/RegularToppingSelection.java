package org.example;

import java.util.ArrayList;

public class RegularToppingSelection {
    private ArrayList<RegularToppings> regularToppings;

    public RegularToppingSelection(ArrayList<RegularToppings> regularToppings) {
        this.regularToppings = regularToppings;
    }

    public ArrayList<RegularToppings> getRegularToppings() {
        return regularToppings;
    }

    public void setRegularToppings(ArrayList<RegularToppings> regularToppings) {
        this.regularToppings = regularToppings;
    }
}

