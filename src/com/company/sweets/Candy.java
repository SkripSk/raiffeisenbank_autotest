package com.company.sweets;

public class Candy extends Sweets{

    private String flavor;

    public Candy(String name, double weight, double price, String flavor){
        super(name, weight, price);
        this.flavor = flavor;
    }

    public Candy() {
        super("Candy", 20.0, 0.3);
        this.flavor = "Strawberry";
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    @Override
    public String getChildFild() {
        return this.flavor;
    }
}
