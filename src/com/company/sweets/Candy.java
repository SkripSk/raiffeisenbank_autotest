package com.company.sweets;

import com.company.annotation.KindOf;

@KindOf(kindOf = "Strawberry")
public class Candy extends Sweets {

    private String flavor;

    public Candy(String name, double weight, double price, String flavor) {
        super(name, weight, price);
        this.flavor = flavor;
    }

    public Candy() {
        super("Candy", 20.0, 0.3);
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getFlavor() {
        return flavor;
    }
}
