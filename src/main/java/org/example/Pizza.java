package org.example;

public class Pizza {
    private CheeseSelection cheese;
    private CrustSelection crust;
    private MeatSelection meat;
    private RegularToppingSelection regularTopping;
    private SauceSelection sauce;
    private PizzaSize size;

    public Pizza(CheeseSelection cheese, CrustSelection crust, MeatSelection meat, RegularToppingSelection regularTopping, SauceSelection sauce, PizzaSize size) {
        this.cheese = cheese;
        this.crust = crust;
        this.meat = meat;
        this.regularTopping = regularTopping;
        this.sauce = sauce;
        this.size = size;
    }

    public CheeseSelection getCheese() {
        return cheese;
    }

    public void setCheese(CheeseSelection cheese) {
        this.cheese = cheese;
    }

    public CrustSelection getCrust() {
        return crust;
    }

    public void setCrust(CrustSelection crust) {
        this.crust = crust;
    }

    public MeatSelection getMeat() {
        return meat;
    }

    public void setMeat(MeatSelection meat) {
        this.meat = meat;
    }

    public RegularToppingSelection getRegularTopping() {
        return regularTopping;
    }

    public void setRegularTopping(RegularToppingSelection regularTopping) {
        this.regularTopping = regularTopping;
    }

    public SauceSelection getSauce() {
        return sauce;
    }

    public void setSauce(SauceSelection sauce) {
        this.sauce = sauce;
    }

    public PizzaSize getSize() {
        return size;
    }

    public void setSize(PizzaSize size) {
        this.size = size;
    }
}


