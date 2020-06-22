package ue06_serienschaltung;

/**
 *
 * @author georgkaufmann
 */

public class Resistor extends Component {
    double current;
    double voltage;
    
    public Resistor(double value) {
        super(null, 0.0);
        if (value <= 0) {
            throw new IllegalArgumentException("invalid parameter value");
        }
        this.value = value;
    }

    public Resistor(String id, double value) {
        super(id, value);
    }

    public void setCurrent(double current) {
        this.current = current;
    }

    public void setVoltage(double voltage) {
        this.voltage = voltage;
    }

    @Override
    public double energy() {
        return 0;
    }

    @Override
    public String unit() {
        return String.format("/u+2126");
    }
}
