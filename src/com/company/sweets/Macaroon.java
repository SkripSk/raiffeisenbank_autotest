package com.company.sweets;

import com.company.annotation.KindOf;

@KindOf(kindOf = "Mint")
public class Macaroon extends Sweets {

    private String flavor;

    public Macaroon(String name, double weight, double price, String flavor){
        super(name, weight, price);
        this.flavor = flavor;
    }

    public Macaroon() {
        super("Macaroon",50.0,1.0);
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }
}
