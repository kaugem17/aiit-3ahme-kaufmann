package kapitel6;

public class vergleichMitEqual {
   public static void main(String[] args) {
     String a = new String("mahlzeit");
     String b = new String("servus");
     System.out.println("a.equals(b) liefert " + a.equals(b));
     
     String c = new String("hallo");
     String d = new String("hallo");
     System.out.println("c.equals(d) liefert " + c.equals(d));
   } 
}
