package org.example;

import java.util.Map;

public class MeatSelection {
    private Map<Meat, Boolean> meats;
    private boolean extraMeat;

    public MeatSelection(Map<Meat, Boolean> meats, boolean extraMeat) {
        this.meats = meats;
        this.extraMeat = extraMeat;
    }

    public Map<Meat, Boolean> getMeats() {
        return meats;
    }

    public void setMeats(Map<Meat, Boolean> meats) {
        this.meats = meats;
    }

    public boolean isExtraMeat() {
        return extraMeat;
    }

    public void setExtraMeat(boolean extraMeat) {
        this.extraMeat = extraMeat;
    }


}



