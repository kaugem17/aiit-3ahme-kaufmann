package kapitel5;

public class mehrdimensionaleArrays {
    public static void main(String[] args)
   {
     int[][] a = new int[4][3];
 
     a[0][0] = 1;
     a[0][1] = 2;
     a[0][2] = 3;
     a[1][0] = 4;
     a[1][1] = 5;
     a[1][2] = 6;
     a[2][0] = 7;
     a[2][1] = 8;
     a[2][2] = 9;
     a[3][0] = 0;
     a[3][1] = 0;
     a[3][2] = 0;
     
     System.out.println(""+a[0][0]+a[0][1]+a[0][2]);
     System.out.println(""+a[1][0]+a[1][1]+a[1][2]);
     System.out.println(""+a[2][0]+a[2][1]+a[2][2]);
     System.out.println(""+a[3][0]+a[3][1]+a[3][2]);
   }
}
