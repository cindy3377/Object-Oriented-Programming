package dao;
import entity.*;

import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.PersistenceException;

public class CurrencyDao {
    private final EntityManager entityManager; // Initialize this in the constructor

    public CurrencyDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public double getExchangeRate(String currencyAbbreviation) {
        String jpql = "SELECT c.rate FROM Currency c WHERE c.abbreviation = :abbreviation";
        try {
            return entityManager.createQuery(jpql, Double.class)
                    .setParameter("abbreviation", currencyAbbreviation)
                    .getSingleResult();
        } catch (NoResultException e) {
            return 0.0;
        } catch (PersistenceException e) {
            e.printStackTrace();
            return 0.0; // Placeholder, replace with actual logic
        }
    }
}
