package entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("concerto")
public class Concerto extends Evento {
    private Enum genere;
    private Enum liveNoLive;

    public Concerto() {
    }

    public Concerto(GenereMusica genere, LiveNoLive liveNoLive) {
        this.genere = genere;
        this.liveNoLive = liveNoLive;
    }

    public Enum getGenere() {
        return genere;
    }

    public void setGenere(Enum genere) {
        this.genere = genere;
    }

    public Enum getLiveNoLive() {
        return liveNoLive;
    }

    public void setLiveNoLive(Enum liveNoLive) {
        this.liveNoLive = liveNoLive;
    }

    @Override
    public String toString() {
        return "Concerto{" +
                "genere=" + genere +
                ", liveNoLive=" + liveNoLive +
                '}';
    }
}
