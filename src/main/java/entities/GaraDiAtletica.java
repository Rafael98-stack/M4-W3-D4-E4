package entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.List;

@Entity
@DiscriminatorValue("gara")
public class GaraDiAtletica extends Evento{
    private List<Persona> persone;
    private Persona persona;

    public GaraDiAtletica() {}

    public GaraDiAtletica(List<Persona> persone, Persona persona) {
        this.persone = persone;
        this.persona = persona;
    }

    public List<Persona> getPersone() {
        return persone;
    }

    public void setPersone(List<Persona> persone) {
        this.persone = persone;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
}
