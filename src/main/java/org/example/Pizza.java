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
    public double calculatePrice() {
        double price = size.getBasePrice();

        double meatPrice = 0;
        double extraMeatPrice = 0;
        double cheesePrice = 0;
        double extraCheesePrice = 0;

        if (size == PizzaSize.Small) {
            meatPrice = 1.00;
            extraMeatPrice = 0.50;
            cheesePrice = 0.75;
            extraCheesePrice = 0.30;
        } else if (size == PizzaSize.Medium) {
            meatPrice = 2.00;
            extraMeatPrice = 1.00;
            cheesePrice = 1.50;
            extraCheesePrice = 0.60;

        } else if (size == PizzaSize.Large) {
            meatPrice = 3.00;
            extraMeatPrice = 1.50;
            cheesePrice = 2.25;
            extraCheesePrice = 0.90;

        }
        if (crust.isStuffedCrust()){
            price += 1.50;
        }

        price += meat.getMeats().size() * meatPrice;

        if (meat.isExtraMeat()){
            price += meat.getMeats().size() * extraMeatPrice;
        }

        price += cheesePrice;

        if (cheese.isAddExtraCheese()){
            price += extraCheesePrice;
        }
        return price;
    }

}


