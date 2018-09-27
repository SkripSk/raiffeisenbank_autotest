package com.company.sweets;

public abstract class Sweets {

    private String name;
    private double weight;
    private double price;
    private boolean isNewYearsGift;

    public Sweets (String name, double weight, double price) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.isNewYearsGift = true;
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

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isNewYearsGift() {
        return isNewYearsGift;
    }

    public void setNewYearsGift(boolean newYearsGift) {
        isNewYearsGift = newYearsGift;
    }
}

