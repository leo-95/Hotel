package estructurasPrincipales;

import java.util.Scanner;

public class Condicionales_EvaluarEdad {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Introduce una edad:");
		int edad=scan.nextInt();
		
		/*if (edad>=18) {
			System.out.println("Puedes Entrar. Es mayor de Edad.");
		}else {System.out.println("No puedes Entrar. Es menor de Edad.");} */
		
		if (edad < 18) {
			System.out.println("Eres un adolecente.");
		}else if (edad < 40) {
			System.out.println("Eres jóven.");
		}else if (edad < 65) {
			System.out.println("Eres maduro.");
		}else {
			System.out.println("Debes cuidarte a tu edad.");
		} scan.close();
	}
}
