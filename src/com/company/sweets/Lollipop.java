package com.company.sweets;

public class Lollipop extends Sweets {

    private String color;

    public Lollipop(String name, double weight, double price, String color) {
        super(name, weight, price);
        this.color = color;
    }

    public Lollipop() {
        super("Lollipop", 150.0, 2.2);
        this.color = "Pink";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getChildFild() {
        return this.color;
    }
}
