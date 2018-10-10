package com.company.sweets;

import com.company.annotation.KindOf;

@KindOf(kindOf = "Pink")
public class Lollipop extends Sweets {

    private String color;

    public Lollipop(String name, double weight, double price, String color) {
        super(name, weight, price);
        this.color = color;
    }

    public Lollipop() {
        super("Lollipop", 150.0, 2.2);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
