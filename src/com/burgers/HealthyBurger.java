package com.burgers;

public class HealthyBurger extends Burger {

    private int tomatoesCount;
    private boolean hasMayo;

    private float tomatoesPrice;
    private float mayoPrice;

    public HealthyBurger() {
        this(2, false);
    }


    public HealthyBurger(int tomatoesCount, boolean hasMayo) {
        super("Healthy", 7, "wheat", "chicken");
        this.tomatoesCount = tomatoesCount;
        this.hasMayo = hasMayo;

        this.tomatoesPrice = 0.3f;
        this.mayoPrice = 0.1f;
    }

    public int getTomatoesCount() {
        return tomatoesCount;
    }

    public void setTomatoesCount(int tomatoesCount) {
        this.tomatoesCount = tomatoesCount;
    }

    public boolean isHasMayo() {
        return hasMayo;
    }

    public void setHasMayo(boolean hasMayo) {
        this.hasMayo = hasMayo;
    }

    @Override
    public float getFinalPrice() {
        return super.getFinalPrice(tomatoesPrice * tomatoesCount) + (hasMayo ? mayoPrice : 0);
    }

    @Override
    public void printSummary() {
        String addition = getTomatoesCount()
                + "Tomatoes, "
                + (hasMayo ? "mayo" : "");

        super.printSummary(addition);
    }
}
