package com.company.sweets;

public class Jellybean extends Sweets {

    private String color;

    public Jellybean (String name, double weight, double price, String color) {
        super(name, weight, price);
        this.color = color;
    }

    public Jellybean() {
        super("Jellybean", 80.0, 1.8);
        this.color = "Varicoloured";
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
