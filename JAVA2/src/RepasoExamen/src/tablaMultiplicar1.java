import java.util.*;
public class tablaMultiplicar1 {
	public static void main (String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Introduce un número:");
		int tabla=scan.nextInt();
		/*for ( tabla=1; tabla<=10; tabla++) {
				System.out.println("La Tabla del " + tabla);*/
		  for (int num=1; num<=10; num++) { 
				System.out.println(tabla +"x"+num+"="+(tabla*num)); 
		}
		  scan.close();
	}
}
