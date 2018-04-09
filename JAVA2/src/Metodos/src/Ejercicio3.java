import java.util.*;
public class Ejercicio3 {
	public static int Potencia (int b, int e) {
		int resultado= 0, a=0;
			resultado= b;
		for (a=1;a<e;a++) {
			resultado=resultado*b;}
			return resultado;
	}
	public static void main (String [] args) {
		Scanner scan=new Scanner (System.in);
		int Base=0, Exponente=0;
			System.out.println("Introduzca la base:");
			Base=scan.nextInt();
			System.out.println("Introduzca el exponente:");
			Exponente=scan.nextInt();
		System.out.println(Potencia(Base,Exponente));	
	}	
		}
