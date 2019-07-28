package com.burgers;

public class DeluxBurger extends Burger{

    private boolean hasDrinks;
    private boolean hasChips;

    private float drinksPrice;
    private float chipsPrice;


    public DeluxBurger() {
        super("Delux", 10, "white", "beef");
        this.hasDrinks = true;
        this.hasChips = true;
        this.drinksPrice = 1.15f;
        this.chipsPrice = 2.12f;

    }

    public boolean isHasDrinks() {
        return hasDrinks;
    }



    public boolean isHasChips() {
        return hasChips;
    }


    @Override
    public float getFinalPrice() {

        return super.getFinalPrice (drinksPrice + chipsPrice);
    }

    @Override
    public void printSummary() {

        super.printSummary("Drinks and chips");
    }
}
