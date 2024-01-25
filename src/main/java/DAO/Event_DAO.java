package DAO;

import entities.Evento;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class Event_DAO {
    private final EntityManager em;

    public Event_DAO(EntityManager em) {
        this.em = em;
    }

    public void save(Evento e) {
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.persist(e);
        transaction.commit();
        System.out.println("Nuovo Evento salvato correttamente");
    }
}
