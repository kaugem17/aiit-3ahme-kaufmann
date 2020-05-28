package kapitel8;

/**
 * im großen und ganzen verstanden, instanceof Number nicht ganz
 */

public class variableParameterliste {
   public static void kontostand(Object... args) {
     double zwischensumme = 0;
     double gesamtsumme   = 0;
     for (int i = 0; i < args.length; ++i) {
       if (args[i] instanceof Number) {
         zwischensumme += ((Number)args[i]).doubleValue();
       } else {
         System.out.println(args[i] + ": " + zwischensumme);
         gesamtsumme += zwischensumme;
         zwischensumme = 0;
       }
     }
     System.out.println("Gesamtsumme: " + gesamtsumme);
   }
 
   public static void main(String[] args) {
     kontostand(
       1.65, 80.00, 19.90, "Einnahmen",
       -3.00, -10.0, -45.00, "Ausgaben",
       0.01, 0.05, "Zinsen"
     );
   } 
}
