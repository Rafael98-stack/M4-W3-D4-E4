package entities;

import javax.persistence.*;

@Entity
@Table(name = "eventi")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo_evento")
public abstract class Evento extends Persona {
@Id
    @GeneratedValue
    protected Long id;
protected String title;
protected Enum tipoEvento;
public Evento(){}

    public Evento(Long id, String title, Enum tipoEvento) {
        this.id = id;
        this.title = title;
        this.tipoEvento = tipoEvento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Enum getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(Enum tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", tipoEvento=" + tipoEvento +
                '}';
    }
}
