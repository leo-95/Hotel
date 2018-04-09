package eva1;

import java.util.Scanner;

public class CuadradoVacio {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce valores para sacar un Cuadrado:");
		int numero = scan.nextInt();
		// Primera Línea del cuadrado.
		for (int i = 0; i < numero; i++) {
			System.out.print(" *");
		}
		System.out.println(" ");
		// Vacío del cuadrado.
		for (int j = 0; j < numero - 2; j++) {
			System.out.print(" *");

			for (int i = 0; i < numero - 2; i++) {
				System.out.print("  ");
			}
			System.out.println(" *");
		}
		// Final de la Línea del cuadrado.
		for (int i = 0; i < numero; i++) {
			System.out.print(" *");
		}
		System.out.println("");
		scan.close();
	}
}
