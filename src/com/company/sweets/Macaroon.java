package com.company.sweets;

public class Macaroon extends Sweets {

    private String flavor;

    public Macaroon(String name, double weight, double price, String flavor){
        super(name, weight, price);
        this.flavor = flavor;
    }

    public Macaroon(String name) {
        super(name);
    }
}
