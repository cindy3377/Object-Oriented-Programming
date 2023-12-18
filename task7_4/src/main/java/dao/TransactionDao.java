package dao;

import jakarta.persistence.EntityManager;

public class TransactionDao {

    public void persist(Transaction cou) {
        EntityManager curr = datasource.MariaDbJpaConnection.getInstance();
        curr.getTransaction().begin();
        curr.persist(cou);
        curr.getTransaction().commit();
    }

    public Transaction find(int id) {
        EntityManager curr = datasource.MariaDbJpaConnection.getInstance();
        Transaction cou = curr.find(Transaction.class, id);
        return cou;
    }
}