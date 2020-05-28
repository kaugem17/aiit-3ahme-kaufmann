package ue05_koerper;

import java.util.ArrayList;

/**
 *
 * @author georgkaufmann
 */

public class KoerperGruppe extends Koerper{
    private ArrayList<Koerper> koerperListe = new ArrayList<>();
    private double dichte;

    public KoerperGruppe(ArrayList koerperListe, double dichte) {
        this.koerperListe = koerperListe;
        this.dichte = dichte;
    }

    KoerperGruppe() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double oberfläche() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double volumen() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void add(Wuerfel wuerfel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
