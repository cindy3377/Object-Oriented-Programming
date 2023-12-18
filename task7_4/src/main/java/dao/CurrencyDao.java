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

    public Currency find(int id) {
        EntityManager em = datasource.MariaDbJpaConnection.getInstance();
        Currency curr = em.find(Currency.class, id);
        return curr;
    }


}
