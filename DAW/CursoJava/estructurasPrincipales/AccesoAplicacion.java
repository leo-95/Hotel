package estructurasPrincipales;

import java.util.Scanner;

public class AccesoAplicacion {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String clave = "password";
		String pass = "";

		while (clave.equals(pass) == false) {
			System.out.println("Introduce la contraseņa, porfavor:");
			pass = scan.nextLine();

			if (clave.equals(pass) == false) {
				System.out.println("Contraseņa incorrecta.!");
			}
		}
		System.out.println("Contraseņa correcta, Acceso permitido.!");
		scan.close();
	}
}
