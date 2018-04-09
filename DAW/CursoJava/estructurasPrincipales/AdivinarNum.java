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
			System.out.println("Introduce un n�mero porfavor:");
			num = entrada.nextInt();
			// El numero introducido se almacenar� en la variable num.
			if (aleatorio < num) {
				System.out.println("N�mero generado m�s bajo.");
			} else if (aleatorio > num) {
				System.out.println("N�mero generado m�s alto.");
			}
		}
			System.out.println("N�mero Correcto. Lo has conseguio en " + intentos + " intentos.");
		
		/*
		// Bucles III

		int num1 = 0;
		int intentos1 = 0;

		do {
			num1 = entrada.nextInt(); // El numero introducido se almacenar� en la variable num.
			System.out.println("Introduce un n�mero porfavor:");
			if (aleatorio < num1) {
				System.out.println("N�mero generado m�s bajo.");
			} else if (aleatorio > num1) {
				System.out.println("N�mero generado m�s alto.");
			}
		} while (num1 != aleatorio);
		System.out.println("N�mero Correcto. Lo has conseguio en " + intentos1 + " intentos.");*/

		entrada.close();
	}
}
