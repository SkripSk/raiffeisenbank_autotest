package com.company;

import com.company.sweets.Sweets;

import java.util.ArrayList;
import java.util.List;

public class NewYearsGift {

    private String name;
    private double totalPrice;
    private double totalWeight;


    public NewYearsGift() {
        this.totalPrice = 0.0;
        this.totalWeight = 0.0;
    }


    List<Sweets> sweetsList = new ArrayList<>();

    public List<Sweets> getSweetsList() {
        return sweetsList;
    }

    public void setSweetsList(List<Sweets> sweetsList) {
        this.sweetsList = sweetsList;
    }

    public void setSweetsList(Sweets sweets) {
        sweetsList.add(sweets);
        this.sweetsList = sweetsList;
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
