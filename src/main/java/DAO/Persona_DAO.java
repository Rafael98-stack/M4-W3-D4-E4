package DAO;

import entities.Persona;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class Persona_DAO {
    private final EntityManager em;

    public Persona_DAO(EntityManager em) {
        this.em = em;
    }

    public void save(Persona e) {
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.persist(e);
        transaction.commit();
        System.out.println("Nuovo Evento salvato correttamente");
    }
}
