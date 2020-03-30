package kapitel9;

public class membervariablen {
   public static void main(String[] args) {
     ClassWithPrivateA a1 = new ClassWithPrivateA(7);
     ClassWithPrivateA a2 = new ClassWithPrivateA(11);
     a1.setOtherA(a2, 77);
     System.out.println("a1 = " + a1.toString());
     System.out.println("a2 = " + a2.toString());
   }
 }
 
 class ClassWithPrivateA {
   private int a;
 
   public ClassWithPrivateA(int a) {
     this.a = a;
   }
 
   public void setOtherA(ClassWithPrivateA other, int newvalue) {
     other.a = newvalue;
   }
 
   public String toString() {
     return "" + a;
   } 
}
