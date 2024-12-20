package c5_sae.c5;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import c5_sae.c5.util.Lieu;
import c5_sae.c5.util.ModaliteTransport;
//import c5_sae.c5.util.Plateforme;
import c5_sae.c5.util.Transport;
import c5_sae.c5.util.Troncon;
import c5_sae.c5.util.TypeCout;
import c5_sae.c5.util.Ville;

public class Main {
    public static void main(String[] args) {
        System.out.println("main");
        Set<Troncon> t= new HashSet<Troncon>();
        Set<Lieu> l= new HashSet<Lieu>();
        Lieu lieu1= new Ville("Lille");
        Lieu lieu2= new Ville("Paris");
        Lieu lieu3= new Ville("Ankara");
        Lieu lieu4= new Ville("Cairo");
        l.add(lieu1);
        l.add(lieu2);
        l.add(lieu3);
        l.add(lieu4);

        Map<TypeCout,Double> couts= new HashMap<TypeCout, Double>();
        couts.put(TypeCout.Prix,20.5);

        Troncon troncon1= new Transport(lieu1, lieu2,ModaliteTransport.AVION, couts);
        Troncon troncon2= new Transport(lieu2, lieu3,ModaliteTransport.AVION, couts);
        Troncon troncon3= new Transport(lieu3, lieu4,ModaliteTransport.AVION, couts);
        Troncon troncon4= new Transport(lieu1, lieu2,ModaliteTransport.TRAIN, couts);

        t.add(troncon1);
        t.add(troncon2);
        t.add(troncon3);
        t.add(troncon4);

        /*Plateforme p= new Plateforme(t,l);

        System.out.println(p.filtrerTroncon(ModaliteTransport.TRAIN));
        */



    }
}
