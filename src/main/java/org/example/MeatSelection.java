package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MeatSelection {
    private ArrayList<Meat> meats;
    private boolean extraMeat;

    public MeatSelection(ArrayList<Meat> meats, boolean extraMeat) {
        this.meats = meats;
        this.extraMeat = extraMeat;
    }

    public ArrayList<Meat> getMeats() {
        return meats;
    }

    public void setMeats(ArrayList<Meat> meats) {
        this.meats = meats;
    }

    public boolean isExtraMeat() {
        return extraMeat;
    }

    public void setExtraMeat(boolean extraMeat) {
        this.extraMeat = extraMeat;
    }

    public void addMeat(Meat meat) {
        meats.add(meat);
    }

    public void removeMeat(Meat meat) {
        meats.remove(meat);
    }

}



