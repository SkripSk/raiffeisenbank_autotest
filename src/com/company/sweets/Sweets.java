package com.company.sweets;

public abstract class Sweets {

    private String name;
    private double weight;
    private double price;

    public Sweets (String name, double weight, double price) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public Sweets(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

}

