package estructurasPrincipales;

import java.util.Scanner;

public class Bucle_For {

	public static void main(String[] args) {
/*
		for (int i = 0; i < 5; i++) {
			System.out.println("Leonardo Calva.");
		}
		System.out.println("Programa terminado.");
*/
		Scanner scan = new Scanner(System.in);

		System.out.println("Introduce un Email:");
		String email = scan.nextLine();
		boolean arroba = false;
		for (int i = 0; i < email.length(); i++) {
			if (email.charAt(i) == '@') {
				arroba = true;
			}
		}
		if (arroba == true) {
			System.out.println("El email es correcto.!");
		} else {
			System.out.println("El email es incorrecto.!");
		}scan.close();
	}
}
