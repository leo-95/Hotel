   import java.util.*;
   public class Ejercicio1{
      public static boolean EsMayor (int num0, int num1){
         boolean mayor=false;
         if (num0>num1) mayor=true;
         return mayor;
      }
      public static void main (String[] args){
         Scanner scan=new Scanner(System.in);
         int x=0, y=0;
         System.out.println ("Introduce 2 numeros: ");
         x=scan.nextInt();
         y=scan.nextInt();
         if (EsMayor(x,y))
         {System.out.println ("El numero " +x+ " es mayor que " +y );}
         else {System.out.println ("El numero " +x+ " es menor que " +y );}	
      }
   }