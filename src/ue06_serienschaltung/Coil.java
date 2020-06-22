package ue06_serienschaltung;

/**
 *
 * @author georgkaufmann
 */

public class Coil extends Component{
    private double value;
    double current;
    
    public Coil(double value) {
        super(null, 0.0);
        if (value <= 0) {
            throw new IllegalArgumentException("invalid parameter value");
        }
        this.value = value;
    }

    public Coil(String id, double value) {
        super(id, value);
    }

    @Override
    public double energy() {
        return this.value * (this.current * this.current) / 2;
    }

    @Override
    public String unit() {
        return String.format("H");
    }
}
