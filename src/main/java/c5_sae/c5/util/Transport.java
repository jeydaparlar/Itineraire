package c5_sae.c5.util;

import java.util.*;

public class Transport implements Troncon {
    private final Lieu depart;
    private final Lieu arrivee;
    private final ModaliteTransport modalite;
    private Map<TypeCout, Double> couts;

    public Transport(Lieu depart, Lieu arrivee, ModaliteTransport modalite, Map<TypeCout, Double> couts) {
        this.depart = depart;
        this.arrivee = arrivee;
        this.modalite = modalite;
        this.couts = new HashMap<TypeCout, Double>();
        this.couts=couts;
    }

    @Override
    public Lieu getDepart() {
        return this.depart;
    }

    @Override
    public Lieu getArrivee() {
        return this.arrivee;
    }

    @Override
    public ModaliteTransport getModalite() {
        return this.modalite;
    }

    public Map<TypeCout, Double> getCout() {
        return this.couts;
    }

    public Double getDouble(TypeCout c){
        return this.couts.get(c);
    }

    @Override
    public String toString() {
        return "Transport{" +
                "depart=" + depart +
                ", arrivee=" + arrivee +
                ", modalite=" + modalite +
                ", cout=" + couts +
                '}';
    }
}