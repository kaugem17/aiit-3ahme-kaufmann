package ue02_serienschaltung;

public class Serienschaltung {
    private double strom;
    private double spannung; 
    private double[] widerstandsFeld;

    private void updateSpannung() {
        if(widerstandsFeld == null) {
            spannung = 0;
        } else {
            spannung = 0;
            for(int i = 0; i < widerstandsFeld.length; ++i) {
                spannung += strom * widerstandsFeld[i];
            }
        }
    }

    public void addWiderstand(double widerstandInOhm) throws InvalidResistorValueException {
        if (widerstandInOhm < 0 || widerstandInOhm > 10E6) {
            throw new InvalidResistorValueException(widerstandInOhm);
        }   
        
        if (widerstandsFeld == null) {
            widerstandsFeld = new double[1];
            widerstandsFeld[0] = widerstandInOhm;
        } else {
            double tmp[];
            tmp = new double[widerstandsFeld.length + 1];
            System.arraycopy(widerstandsFeld, 0, tmp, 0, widerstandsFeld.length);
            tmp[tmp.length - 1] = widerstandInOhm;
            widerstandsFeld = tmp;
        } 
        
        updateSpannung();
    }

    public double getStrom() {
        return strom;
    }

    public void setStrom(double strom) {
        this.strom = strom;
        updateSpannung();
    }

    public double getSpannung() {
        return spannung;
    }

    @Override
    public String toString() {
        return "Serienschaltung{" + "strom=" + strom + ", spannung=" + spannung + ", widerstandsFeld=" + widerstandsFeld + '}';
    }
}