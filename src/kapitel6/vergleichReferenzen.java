package kapitel6;

public class vergleichReferenzen {
   public static void main(String[] args) {
     String a = new String("hallo");
     String b = new String("hallo");
     System.out.println("a == b liefert " + (a == b));
     System.out.println("a != b liefert " + (a != b));
   } 
}
