package kapitel9;

public class klassenvariablen {
    static private int objcnt = 0;
 
   public klassenvariablen() {
     ++objcnt;
   }
 
   public void finalize() {
     --objcnt;
   }
 
   public static void main(String[] args) {
     klassenvariablen auto1;
     klassenvariablen auto2 = new klassenvariablen();
     System.out.println(
       "Anzahl Testauto-Objekte: " + klassenvariablen.objcnt
     );
   }
}
