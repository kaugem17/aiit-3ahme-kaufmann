package ue01_taschenrechner;

public class Taschenrechner {
   public double a;
   public double b;

   public Taschenrechner (double a, double b) {
       this.a = a;
       this.b = b;
   }

   public double getAdditionsResult() { 
       double additionResult = a + b;
       return additionResult;
   }

   public double getSubtractionResult() { 
       double substractionResult = a - b;
       return substractionResult;
   }

   public double getMultiplicationResult() { 
       double multiplicationResult = a * b;
       return multiplicationResult;
   }

   public double getDivisionResult() { 
       double divisionResult = a / b;
       return divisionResult;
   }

}