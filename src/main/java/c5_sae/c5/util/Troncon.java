package c5_sae.c5.util;

import java.util.Map;
public interface Troncon  {
    Lieu getDepart();
    Lieu getArrivee();
    ModaliteTransport getModalite();
    Map<TypeCout, Double> getCout(); 
    Double getDouble(TypeCout c);

}
