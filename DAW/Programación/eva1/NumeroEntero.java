package eva1;

import java.util.Scanner;

public class NumeroEntero {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		
		System.out.println("Introduce un número entero:");
		int numero=scan.nextInt();
		
		if (numero % 2==0) {
			System.out.println("El número introducido es entero.");
		}else {
			System.out.println("El número introducir es erróneo.");
		}
		scan.close();
	}
}
