package com.company.sweets;

public class Jellybean extends Sweets {

    private int size;

    public Jellybean (String name, double weight, double price, int size) {
        super(name, weight, price);
        this.size = size;
    }

    public Jellybean(String name) {
        super(name);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
