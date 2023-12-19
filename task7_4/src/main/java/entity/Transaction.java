package entity;

import jakarta.persistence.*;

@Entity
public class Country {
    @Id
    private int id;
    private final String abbreviation;
    private final String name;

    private final double rate;

    public Country(String abbreviation, String name, double rate) {
        this.abbreviation = abbreviation;
        this.name = name;
        this.rate = rate;
    }

    public Country() {
        this.abbreviation = "";
        this.name = "";
        this.rate = 0.0;
    }

    public String getAbbreviation() {
        return abbreviation;
    }
    public String getName() {
        return name;
    }

    public double getRate() {
        return rate;
    }
    @Override
    public String toString() {
        return abbreviation + " - " + name;
    }
}
