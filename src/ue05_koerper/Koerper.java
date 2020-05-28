package ue05_koerper;

/**
 *
 * @author georgkaufmann
 */

public abstract class Koerper {
    private double dichte;
    public double DICHTE_EICHE = 670;
    public double DICHTE_BUCHE = 690;

    public Koerper(double dichte) {
        this.dichte = dichte;
    }

    public double getDichte() {
        return dichte;
    }

    public void setDichte(double dichte) {
        this.dichte = dichte;
    }
    
    public abstract double oberfläche();
    
    public abstract double volumen();
    
    public double masse() {
        return volumen()*dichte;
    }
}