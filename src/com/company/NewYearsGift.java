package com.company;

public class NewYearsGift {

    private double totalPrice;
    private double totalWeight;

    public NewYearsGift() {
        this.totalPrice = 0.0;
        this.totalWeight = 0.0;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public double getTotalWeight() {
        return totalWeight;
    }

    public void setTotalPrice(int count, double price) {
        this.totalPrice += count * price;
    }

    public void setTotalWeight(int count, double weight) {
        this.totalWeight += count * weight;
    }
}
