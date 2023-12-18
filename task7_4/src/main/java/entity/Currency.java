package entity;
import jakarta.persistence.*;

@Entity

public class Currency {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String abbreviation;
    private String name;
    private double rate;

    @ManyToOne
    private Transaction transaction;

    public Currency(String abbreviation, String name, double rate, Transaction transaction) {
        super();
        this.abbreviation = abbreviation;
        this.name = name;
        this.rate = rate;
        this.transaction = transaction;
    }
    public Currency() {
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

    public Transaction getTransaction() {
        return transaction;
    }

    @Override
    public String toString() {
        return abbreviation + " - " + name;
    }
}
