import java.util.*;
public class Caclulos_conMath {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
			System.out.println ("Escribe la potencia: ");
															//double raiz=Math.sqrt(37);
		double base=0;
		double exponente=0;
			base=scan.nextDouble();
			exponente=scan.nextDouble();
		int resultado=(int)Math.pow(base, exponente);
			System.out.println ("El resulado de " + base + " elevado a " + exponente + " es " +resultado);
			scan.close();
	}

}
