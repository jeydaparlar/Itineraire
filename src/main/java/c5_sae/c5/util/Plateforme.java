/*package c5_sae.c5.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;
import fr.ulille.but.sae_s2_2024.*;

public class Plateforme  {
    private Set<Troncon> troncons;
    private Set<Lieu> lieux;
    MultiGrapheOrienteValue graph;

    public Plateforme(Set<Troncon> troncons,  Set<Lieu> lieux){
        this.troncons=new HashSet<Troncon>();
        this.lieux = new HashSet<Lieu>();
        this.troncons=troncons;
        this.lieux=lieux;

        this.graph= new MultiGrapheOrienteValue();
        graph.sommet(this.lieux);
        graph.aretes(this.troncons);
    }

    public Set<Troncon> getTroncons() {
        return this.troncons;
    }

    public Set<Lieu> getLieux() {
        return this.lieux;
    }

    public void setLieux(Set<Lieu> lieux) {
        this.lieux = lieux;
    }

    public boolean getDataString(String[] data){

    }

    public void getDataCSV(String filePath){
        List<List<String>> records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(";");
                records.add(Arrays.asList(values));
            }
        }
    }

    public Troncon findIfPresent(Troncon source,Set<Troncon> set){
        if (set.contains(source)) {
            for (Troncon obj : set) {
                if (obj.equals(source))
                    return obj;
            }
        }

        return null;
    }
    public boolean itinerairePossibleModailte(Lieu depart, Lieu arrivee, ModaliteTransport modalite) throws Exception {
        if(filtrerTroncon(modalite).isEmpty()){
            throw new Exception("Cet itineraire n'existe pas");
            return false;
        }
        if(!this.lieux.contains(depart) || !this.lieux.contains(arrivee)){
            throw new Exception("Cette ville n'est pas disponible");
            return false;
        }
        return true;
    }

    public Set<Troncon> filtrerTroncon(ModaliteTransport modalite) {
        List<Troncon> t= new ArrayList<Troncon>();
        for(int i=0; i<this.troncons.size(); i++){
            if(this.troncons.get(i).getModalite().equals(modalite)){
                t.add(this.troncons.get(i));
            }
        }
        return t;
    }

    public List<Chemin> calculItineraire(Lieu depart, Lieu arrivee,TypeCout cout, ModaliteTransport modalite){
        MultiGrapheOrienteValue g= new MultiGrapheOrienteValue();
        g.sommet(this.lieux);
        for(Troncon i : troncons){
            Troncon t=i;
            if(critereModalite.equals(i.getModalite())){
                g.ajouterArete(t,t.getDouble(critereCout));
            }
        }
        return AlgorithmeKPCC.kpcc(g,depart,arrivee,3);

    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((troncons == null) ? 0 : troncons.hashCode());
        result = prime * result + ((lieux == null) ? 0 : lieux.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Plateforme other = (Plateforme) obj;
        if (troncons == null) {
            if (other.troncons != null)
                return false;
        } else if (!troncons.equals(other.troncons))
            return false;
        if (lieux == null) {
            if (other.lieux != null)
                return false;
        } else if (!lieux.equals(other.lieux))
            return false;
        return true;
    }
}
*/