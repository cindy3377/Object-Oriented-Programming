package datasource;

import jakarta.persistence.*;

public class MariaDbJpaConnection {

    private static EntityManagerFactory factory = null;
    private static EntityManager entityManager = null;
    private static final String PERSISTENCE_UNIT_NAME = "task7_3";

    public static EntityManager getEntityManager() {
        if (entityManager == null) {
            factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
            entityManager = factory.createEntityManager();
        }
        return entityManager;
    }

    public static void close() {
        if (entityManager != null) {
            entityManager.close();
        }
        if (factory != null) {
            factory.close();
        }
    }
}
