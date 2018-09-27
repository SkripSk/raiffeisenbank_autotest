package com.company.sweets;

public class Candy extends Sweets{

    private String flavor;

    public Candy(String name, double weight, double price, String flavor){
        super(name, weight, price);
        this.flavor = flavor;
    }

    public Candy(String name) {
        super(name);
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getFlavor() {
        return flavor;
    }
}
