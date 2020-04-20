package ue02_serienschaltung;

public class Serienschaltung {
    private double strom;
    private double spannung;
    private double[] widerstandFeld;
    
    private void updateSpannung() {
        if (widerstandFeld == null) {
            spannung = 0;
        } else {
            for (int i = 0; i < widerstandFeld.length; i++) {
                spannung += strom * widerstandFeld[i];
            }
        }
    }
    
    public void addWiderstand(double widerstandInOhm) {
       if(widerstandFeld == null) {
            widerstandFeld = new double[1];
            widerstandFeld[0] = widerstandInOhm;
        } else {
            double tmp[];
            tmp = new double[widerstandFeld.length];
            System.arraycopy(widerstandFeld, 0, tmp, 0, widerstandFeld.length);
            widerstandFeld = new double[widerstandFeld.length + 1];
            System.arraycopy(tmp, 0, widerstandFeld, 0, widerstandFeld.length);
            widerstandFeld[widerstandFeld.length] = widerstandInOhm;
        }
        updateSpannung();
    }
    
    public double getStrom() {
       
       return 0; 
    }
    
    public void setStrom(double strom) {
        this.strom = strom;
        updateSpannung();
    } 
    
    public double getSpannung() {
        
        return 0;
    }

    @Override
    public String toString() {
        return "Serienschaltung{" + "strom=" + strom + ", spannung=" + spannung + ", widerstand=" + widerstandFeld + '}';
    }
    
    
}