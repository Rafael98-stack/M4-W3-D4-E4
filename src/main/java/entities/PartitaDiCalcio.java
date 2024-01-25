package entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("partita")
public class PartitaDiCalcio extends Evento{
    private String squadraCasa;
    private String squadraOspite;
    private String squadreVincente;
    private int golCasa;
    private int golOspite;
    public PartitaDiCalcio(){}

    public PartitaDiCalcio(String squadraCasa, String squadraOspite, String squadreVincente, int golCasa, int golOspite) {
        this.squadraCasa = squadraCasa;
        this.squadraOspite = squadraOspite;
        this.squadreVincente = squadreVincente;
        this.golCasa = golCasa;
        this.golOspite = golOspite;
    }

    public String getSquadraCasa() {
        return squadraCasa;
    }

    public void setSquadraCasa(String squadraCasa) {
        this.squadraCasa = squadraCasa;
    }

    public String getSquadraOspite() {
        return squadraOspite;
    }

    public void setSquadraOspite(String squadraOspite) {
        this.squadraOspite = squadraOspite;
    }

    public String getSquadreVincente() {
        return squadreVincente;
    }

    public void setSquadreVincente(String squadreVincente) {
        this.squadreVincente = squadreVincente;
    }

    public int getGolCasa() {
        return golCasa;
    }

    public void setGolCasa(int golCasa) {
        this.golCasa = golCasa;
    }

    public int getGolOspite() {
        return golOspite;
    }

    public void setGolOspite(int golOspite) {
        this.golOspite = golOspite;
    }

    @Override
    public String toString() {
        return "PartitaDiCalcio{" +
                "squadraCasa='" + squadraCasa + '\'' +
                ", squadraOspite='" + squadraOspite + '\'' +
                ", squadreVincente='" + squadreVincente + '\'' +
                ", golCasa=" + golCasa +
                ", golOspite=" + golOspite +
                '}';
    }
}
