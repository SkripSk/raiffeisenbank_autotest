package com.company.sweets;

import com.company.annotation.KindOf;

@KindOf(kindOf = "Ginger-snap")
public class Cookie extends Sweets {
    private String species;

    public Cookie (String name, double wight, double price, String species) {
        super(name, wight, price);
        this.species = species;
    }

    public Cookie() {
        super("Cookie", 80.0, 0.5);
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
}
