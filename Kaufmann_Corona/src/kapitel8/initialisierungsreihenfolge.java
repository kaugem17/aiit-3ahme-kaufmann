package kapitel8;

public class initialisierungsreihenfolge {
   public static String getAndPrint(String s) {
     System.out.println(s);
     return s;
   }
 
   public static void main(String[] args) {
     Son son = new Son();
   }
 }
 
 class Father {
   private String s1 = initialisierungsreihenfolge.getAndPrint("Father.s1");
 
   public Father() {
     initialisierungsreihenfolge.getAndPrint("Father.<init>");
   }
 }
 
 class Son
 extends Father {
   private String s1 = initialisierungsreihenfolge.getAndPrint("Son.s1");
 
   public Son() {
     initialisierungsreihenfolge.getAndPrint("Son.<init>");
   }
}
