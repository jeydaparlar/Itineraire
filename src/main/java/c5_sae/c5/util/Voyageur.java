package c5_sae.c5.util;

import java.util.HashMap;
import java.util.Map;

public class Voyageur {
    private  String nom;
    private   Map<TypeCout, Double> critereCout;
    private ModaliteTransport critereModalite;

    public Voyageur(String nom, Map<TypeCout, Double> critereCout,ModaliteTransport critereModalite) {
        this.nom = nom;
        this.critereCout = new HashMap<TypeCout, Double>();
        this.critereCout=critereCout;
        this.critereModalite=critereModalite;
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom){
        this.nom=nom;
    }


    @Override
    public String toString() {
        return "Voyageur{" +
                "nom='" + nom + '\'' +
                ", critere= Cout " + critereCout + "ModalitÃ© "+ critereModalite +
                '}';
    }

    public Map<TypeCout, Double> getCritereCout() {
        return critereCout;
    }

    public ModaliteTransport getCritereModalite() {
        return critereModalite;
    }
}