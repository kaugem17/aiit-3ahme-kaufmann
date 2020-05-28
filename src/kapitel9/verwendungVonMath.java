package kapitel9;

public class verwendungVonMath {
    public static void main(String[] args)
   {
     double x, y;
     for (x = 1.0; x <= 9.0; x = x + 1.0) {
       y = Math.sqrt(x);
       System.out.println("sqrt("+x+") = "+y);
     }
   }
}
