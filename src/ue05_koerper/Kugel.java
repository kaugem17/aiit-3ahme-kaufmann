package ue05_koerper;

import java.util.Locale;

/**
 *
 * @author georgkaufmann
 */

public class Kugel extends Koerper {
    private double r;

    public Kugel(double r) {
        super(0.0);
        if (r <= 0) {
            throw new IllegalArgumentException("invalid parameter r");
        }
        this.r = r;
    } 
    
    public Kugel(double r, double dichte) {
        super(dichte);
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double oberflaeche() {
        return 4 * r * r * Math.PI;
    }
    
    @Override
    public double volumen() {
        return 3 / 4 * Math.PI * Math.pow(r, 3);
    }
    
    @Override
    public String toString() {
        return String.format(Locale.ENGLISH, "\"r\":%e,\"diche\":%e", r, dichte);
    }
}
