package com.company;

import com.company.sweets.Sweets;

import java.util.HashMap;
import java.util.Map;

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
        for (Map.Entry<Sweets, Integer> entry : sweetMap.entrySet()) {
            this.totalWeight += entry.getKey().getWeight() * entry.getValue();
        }
        for (Map.Entry<Sweets, Integer> entry : sweetMap.entrySet()) {
            this.totalPrice += entry.getKey().getPrice() * entry.getValue();
        }
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
