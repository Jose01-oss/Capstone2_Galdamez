package org.example;

public class CheeseSelection {
    private Cheese cheese;
    private boolean addExtraCheese;

    public CheeseSelection(Cheese cheese, boolean addExtraCheese) {
        this.cheese = cheese;
        this.addExtraCheese = addExtraCheese;
    }

    public Cheese getCheese() {
        return cheese;
    }

    public void setCheese(Cheese cheese) {
        this.cheese = cheese;
    }

    public boolean isAddExtraCheese() {
        return addExtraCheese;
    }

    public void setAddExtraCheese(boolean addExtraCheese) {
        this.addExtraCheese = addExtraCheese;
    }


}


