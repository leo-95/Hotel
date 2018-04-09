import java.util.*;
public class Ejercicio4 {
	
	public static int Tabla (int num1) {
		int resultado=0, i=0;
			resultado=num1;
		for (i=1; i<=10; i++) 
		{
			System.out.println (num1 + " x " + i + " = " + num1*i);
		}
			return resultado;
		}
	public static void main (String[] args) {
		Scanner scan=new Scanner (System.in);
		int n=0;
		System.out.println ("Introduce un numero: ");
		n=scan.nextInt();
		System.out.println ("Tabla del " + n + " :");
		System.out.println(Tabla (n));
			scan.close();
	}
}
