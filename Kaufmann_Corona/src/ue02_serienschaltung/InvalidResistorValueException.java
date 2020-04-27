package ue02_serienschaltung;


public class InvalidResistorValueException {
    double invalidValue;
    double[] widerstand;

    public InvalidResistorValueException (int widerstand) throws IllegalArgumentException {
         if (widerstand < 0) {
             throw new IllegalArgumentException("widerstandsFeld darf nicht kleiner 0 sein");
         }
         if (widerstand > 10000000) {
             throw new IllegalArgumentException("widerstandsFeld darf nicht kleiner 10M Ohm sein");
         }
    }
}