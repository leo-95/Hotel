	   import java.util.*;
	   public class Ejercicio2{
	      public static int area (int base, int altura){
	         return (base*altura);
	      }
	      public static int perimetro (int base, int altura){
	         int perimetro= (base*2)+(altura*2);
	         return perimetro;
	      }
			public static boolean SioNo(int base, int altura){
				boolean igual=false;
				if (base==altura) igual=true;
				return igual;
				}
	      public static void main (String[] args){
	         Scanner scan=new Scanner (System.in);
	         System.out.println("Escribe la base: ");
	         int base=scan.nextInt();
	         System.out.println ("Escribe la altura: ");
	         int altura=scan.nextInt();
	         System.out.println("La area es " +area(base,altura)+ " y su perimetro " +perimetro(base,altura));
				if (SioNo(base,altura)){
				System.out.println ("Es un cuadrado");}
				else {System.out.println ("Es un ractangulo");}
	      }
			
	   }