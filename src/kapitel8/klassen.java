package kapitel8;

/** 
 * selber geschrieben und verstanden
 */

class PKW {
   public String marke;
   public String modell;
   public double preis;
   public int baujahr;
   public int erstzulassung;
 }

public class klassen {
    public static void main (String[] args) {
        PKW ersterPKW = new PKW();
        ersterPKW.marke = "Tesla";
        ersterPKW.modell = "S";
        ersterPKW.preis = 175.80;
        ersterPKW.baujahr = 2020;
        ersterPKW.erstzulassung = 2020;
        
        System.out.println("==========");
        System.out.println("Erster PKW");
        System.out.println("==========");
        System.out.println("Hersteller "+ersterPKW.marke);
        System.out.println("Bezeichnung "+ersterPKW.modell);
        System.out.println("Preis "+ersterPKW.preis+"€");
        System.out.println("Baujahr "+ersterPKW.baujahr);
        System.out.println("Erstzulassung "+ersterPKW.erstzulassung);
    } 
}




