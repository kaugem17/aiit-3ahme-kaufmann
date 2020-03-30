package ue01_taschenrechner;

import java.util.Scanner;
import ue01_taschenrechner.Taschenrechner;

public class TestTaschenrechner {
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       System.out.print("\nWert a: ");
       double a = sc.nextDouble();
       
       System.out.print("Wert b: ");
       double b = sc.nextDouble();
       
       Taschenrechner taschenrechner = new Taschenrechner(a, b);
       System.out.format("\n  Addtion: " + taschenrechner.getAdditionsResult() + "\n");
       System.out.format("  Subtraktion: " + taschenrechner.getSubtractionResult() + "\n");
       System.out.format("  Mutliplikation: " + taschenrechner.getMultiplicationResult() + "\n");
       System.out.format("  Division: " + taschenrechner.getDivisionResult() + "\n\n");
    }
}
