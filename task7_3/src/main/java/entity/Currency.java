package entity;
import jakarta.persistence.*;

@Entity
@Table(name = "currency")

public class Currency {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "abbreviation")
    private final String abbreviation;
    @Column(name = "name")
    private final String name;
    private final double rate;

    public Currency(String abbreviation, String name, double rate) {
        this.abbreviation = abbreviation;
        this.name = name;
        this.rate = rate;
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
