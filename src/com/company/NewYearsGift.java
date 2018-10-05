package com.company;

import com.company.sweets.Sweets;

import java.util.HashMap;

public class NewYearsGift {

    private String name;
    private double totalPrice;
    private double totalWeight;


    public NewYearsGift() {
        this.totalPrice = 0.0;
        this.totalWeight = 0.0;
    }


    HashMap<Sweets, Integer> sweetMap = new HashMap<>();

    public HashMap<Sweets, Integer> getSweetMap() {
        return sweetMap;
    }

    public void setSweetsMap(HashMap<Sweets, Integer> sweetsMap) {
        this.sweetMap = sweetsMap;
    }

    public void setSweetsList(Sweets sweets, int i) {
        sweetMap.put(sweets, i);
        this.sweetMap = sweetMap;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTotalWeight(int count, double weight) {
        this.totalWeight += count * weight;
    }
}
