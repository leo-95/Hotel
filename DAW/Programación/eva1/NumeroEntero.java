package eva1;

import java.util.Scanner;

public class NumeroEntero {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		
		System.out.println("Introduce un n�mero entero:");
		int numero=scan.nextInt();
		
		if (numero % 2==0) {
			System.out.println("El n�mero introducido es entero.");
		}else {
			System.out.println("El n�mero introducir es err�neo.");
		}
		scan.close();
	}
}
