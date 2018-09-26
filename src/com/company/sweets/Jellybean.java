package com.company.sweets;

public class Jellybean extends Sweets {

    private int size;

    public Jellybean (String name, double weight, double price, int size) {
        super(name, weight, price);
        this.size = size;
    }
}
