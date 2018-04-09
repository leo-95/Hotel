package estructurasPrincipales;

import java.util.*;

public class AdivinarNum {

	public static void main(String[] args) {

		// Bucles II

		int aleatorio = (int) (Math.random() * 100);

		Scanner entrada = new Scanner(System.in);

		int num = 0;
		int intentos = 0;

		while (num != aleatorio) {
			System.out.println("Introduce un número porfavor:");
			num = entrada.nextInt();
			// El numero introducido se almacenará en la variable num.
			if (aleatorio < num) {
				System.out.println("Número generado más bajo.");
			} else if (aleatorio > num) {
				System.out.println("Número generado más alto.");
			}
		}
			System.out.println("Número Correcto. Lo has conseguio en " + intentos + " intentos.");
		
		/*
		// Bucles III

		int num1 = 0;
		int intentos1 = 0;

		do {
			num1 = entrada.nextInt(); // El numero introducido se almacenará en la variable num.
			System.out.println("Introduce un número porfavor:");
			if (aleatorio < num1) {
				System.out.println("Número generado más bajo.");
			} else if (aleatorio > num1) {
				System.out.println("Número generado más alto.");
			}
		} while (num1 != aleatorio);
		System.out.println("Número Correcto. Lo has conseguio en " + intentos1 + " intentos.");*/

		entrada.close();
	}
}
