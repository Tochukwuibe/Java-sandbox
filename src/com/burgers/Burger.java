package com.burgers;

public class Burger {

    private String breadRollType;
    private String name;
    private String meat;

    private int lettusCount;
    private int picklesCount;
    private float price;



    private float lettusPrice;
    private float picklesPrice;


    public Burger () {
        this("Plain", 5, "white", "none");
    }


    public Burger(String name, float price, String breadRollType, String meat) {

        this.meat = meat;
        this.name = name;
        this.price = price >= 0f ? price : 0f;

        this.breadRollType = breadRollType;
        this.lettusPrice = 0.15f;
        this.picklesPrice = 0.12f;
        this.lettusCount = 1;
        this.picklesCount = 1;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public String getName() {
        return name;
    }

    public String getMeat() {
        return meat;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public int getLettusCount() {
        return lettusCount;
    }

    public void setLettusCount(int lettusCount) {
        this.lettusCount = lettusCount;
    }

    public int getPicklesCount() {
        return picklesCount;
    }

    public void setPicklesCount(int picklesCount) {
        this.picklesCount = picklesCount;
    }

    public float getPrice() {
        return price;
    }

    public float getFinalPrice() {

        float addition =
                (lettusCount * lettusPrice) + (picklesCount * picklesPrice);

        return  getFinalPrice(addition);
    }

    public float getFinalPrice(float addition) {
        return price + addition;
    }


    public void printSummary() {

        String addition = + getPicklesCount()
                + " Pickles, "
                + getLettusCount()
                + " Lettus.";

        printSummary(addition);

    }

    public void printSummary(String addition) {

        System.out.println(this.getClass().getSimpleName() + " costs: "
                + this.formatCurrency(getPrice())
                + " including "
                + addition
                + "  For a final price of"
                + formatCurrency(getFinalPrice()));
    }


    protected String formatCurrency(float number) {
//        float epsilon = 0.004f;
//        if (Math.abs(Math.round(number) - number) < epsilon) {
//            return String.format("%10.0f", number);
//        } else {
//            return String.format("%10.2f", number);
//        }
        return " $ " +number;
    }


}
