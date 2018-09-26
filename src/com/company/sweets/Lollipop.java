package com.company.sweets;

public class Lollipop extends Sweets {

    private String color;

    public Lollipop (String name, double weight, double price, String color) {
        super(name, weight, price);
        this.color = color;
    }

    public Lollipop(String name) {
        super(name);
    }
}
