package ue06_serienschaltung;

/**
 *
 * @author georgkaufmann
 */

public class Capacitor extends Component {
    double current;
    double voltage;
    
    public Capacitor(double value) {
        super(null, 0.0);
        if (value <= 0) {
            throw new IllegalArgumentException("invalid parameter value");
        }
        this.value = value;
    }

    public Capacitor(String id, double value) {
        super(id, value);
    }

    @Override
    public double energy() {
        return current * (voltage * voltage) / 2;
    }

    @Override
    public String unit() {
        return String.format("F");
    }
}
