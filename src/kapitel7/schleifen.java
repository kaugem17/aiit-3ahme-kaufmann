package kapitel7;

public class schleifen {
    public static void main(String[] args) {
        
        String a;
        String b;
        
        a = "Coronavirus";
        b = "Hallo";
        
        if (a.equals(b) == false) {
            return;
        } else {
            System.out.println("Die beiden Strings sind gleich");
        }
        
        /*
          Verzweigungen wurden verstanden
        */
        
        System.out.println("");
        
        int eingabe;
        do {
            System.out.println("Eingabe: 2");
            eingabe = 2;
        } while (eingabe < 1 || eingabe > 4);
        
        System.out.println("");
        
        double y = 0.5;
        int i = 1;
        
        while(y < 9) {
            System.out.println("-> " + i);
            ++ i;
            y += y;
        }
        
        /*
          Schleifen wurden auch verstanden
        */
        
        System.out.println("");
        
        /*
          Die erweiterte for Schleife wurde nicht verstanden
        */
        
    }   
}
