package com.company.sweets;

public class Cookie extends Sweets {
    private String species;

    public Cookie (String name, double wight, double price, String species) {
        super(name, wight, price);
        this.species = species;
    }

    public Cookie(String name) {
        super(name);
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
}
