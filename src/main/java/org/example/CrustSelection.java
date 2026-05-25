package org.example;

public class CrustSelection {
    private Crust crust;
    private boolean stuffedCrust;

    public CrustSelection(Crust crust, boolean stuffedCrust) {
        this.crust = crust;
        this.stuffedCrust = stuffedCrust;
    }

    public Crust getCrust() {
        return crust;
    }

    public void setCrust(Crust crust) {
        this.crust = crust;
    }

    public boolean isStuffedCrust() {
        return stuffedCrust;
    }

    public void setStuffedCrust(boolean stuffedCrust) {
        this.stuffedCrust = stuffedCrust;
    }
}
