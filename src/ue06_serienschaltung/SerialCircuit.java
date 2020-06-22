package ue06_serienschaltung;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author georgkaufmann
 */

public class SerialCircuit {
    private final List<Component>componentListe = new ArrayList<>();
    private double current;

    public SerialCircuit(Collection<Component> component){
        this.componentListe.addAll(component);
    }
    
    void add(Component c) {
        c.value = current;
    }

    public double getCurrent() {
        return current;
    }

    public void setCurrent(double current) {
        this.current = current;
    }
    
   public double totalVoltage() {
       double rv = 0.0;
        for(Component c : componentListe){
            rv = c.getValue() * c.getCurrent();
        }
        return rv;
   } 
   
   public double totalPower() {
       double rv = 0.0;
        for(Component c : componentListe){
            rv = c.power();
        }
        return rv;
   } 
   
   public double totalEnergy() {
       double rv = 0.0;
        for(Component c : componentListe){
            rv = c.energy();
        }
        return rv;
   } 
   
   public Component component(String id) {
       return null;
   }
   
   public List<Component> getComponents() {
       return null;
   }
   
   public Component [] toArray() {
       return null;
   }
   
   @Override
   public String toString() {
       return null;
   }
}