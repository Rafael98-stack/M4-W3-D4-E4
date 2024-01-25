package org.example;

import DAO.Event_DAO;
import DAO.Persona_DAO;
import entities.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("Eventi");
    public static void main( String[] args )
    {
        EntityManager em = emf.createEntityManager();
        Event_DAO ed = new Event_DAO(em);
        Persona_DAO pd= new Persona_DAO(em);
        List<Persona> persone= new ArrayList<>();
        persone.add(new Persona("Marco","Callegari"));
        persone.add(new Persona("Mirco","Orosio"));
        persone.add(new Persona("Gianni","Cabiddu"));
        Persona persona = new Persona("Gianni","Cabiddu");

        PartitaDiCalcio RomaCagliari = new PartitaDiCalcio("Roma","Cagliari","Cagliari",1,3);
        GaraDiAtletica Olipiadi = new GaraDiAtletica(persone,persona);
        Concerto concerto = new Concerto(GenereMusica.POP,LiveNoLive.TRUE);

pd.save(persona);
ed.save(RomaCagliari);
        ed.save(Olipiadi);
        ed.save(concerto);
    }
}
