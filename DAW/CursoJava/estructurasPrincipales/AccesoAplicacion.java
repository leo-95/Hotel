package estructurasPrincipales;

import java.util.Scanner;

public class AccesoAplicacion {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String clave = "password";
		String pass = "";

		while (clave.equals(pass) == false) {
			System.out.println("Introduce la contrase�a, porfavor:");
			pass = scan.nextLine();

			if (clave.equals(pass) == false) {
				System.out.println("Contrase�a incorrecta.!");
			}
		}
		System.out.println("Contrase�a correcta, Acceso permitido.!");
		scan.close();
	}
}
