package ue05_koerper;

/**
 *
 * @author georgkaufmann
 */

public abstract class Koerper {
    protected double dichte;
    public static final double DICHTE_EICHE = 670;
    public static final double DICHTE_BUCHE = 690;

    public Koerper(double dichte) {
        if (dichte < 0) {
            throw new IllegalArgumentException("invalid parameter dichte");
        }
        this.dichte = dichte;
    }

    public double getDichte() {
        return dichte;
    }

    public void setDichte(double dichte) {
        this.dichte = dichte;
    }

    public abstract double oberflaeche();
    
    public abstract double volumen();
     
    public double masse () {
        return volumen() * dichte;
    }
}