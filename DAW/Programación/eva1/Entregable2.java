package eva1;

import java.util.Scanner;

public class Entregable2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		boolean salir = false;
		int menu;

		while (!salir) {
			System.out.println("Elige una opción del siguiente menú:");
			System.out.println("1. Operaciones matemáticas.");
			System.out.println("2. Operaciones de pintado.");
			System.out.println("3. Salir.");
			menu = scan.nextInt();
			switch (menu) {
			case 1:
				System.out.println("Has elegido la opción 1.");
				System.out.println("Introduce primer valor:");
				int valor1 = scan.nextInt();
				System.out.println("Introduce segundo valor:");
				int valor2 = scan.nextInt();

				// Primera parte.
				System.out.println("******************************");
				if (valor1 % 2 == 0) {
					System.out.println("Es par.");
				} else {
					System.out.println("Es impar.");
				}
				if (valor2 % 2 == 0) {
					System.out.println("Es par.");
				} else {
					System.out.println("Es impar.");
				}
				System.out.println("******************************");

				// Segunda parte.
				if (valor1 > valor2) {
					if (valor1 % 2 == 0) {
						int num1 = (valor1 + 1);
						System.out.println("El número impar es: " + num1);
					} else {
						int num1 = (valor1 + 2);
						System.out.println("El número impar es: " + num1);
					}
				} else {
					if (valor2 % 2 == 0) {
						int num2 = (valor2 + 1);
						System.out.println("El número impar es: " + num2);
					} else {
						int num2 = (valor2 + 2);
						System.out.println("El número impar es: " + num2);
					}
				}

				// Parte 3.
				System.out.println("******************************");
				if (valor1 > valor2) {
					int aux = valor2;
					int total = 0;
					while (valor2 != 0) {
						total = total + (valor2 % 10);
						valor2 = valor2 / 10;
					}
					System.out.println("La suma de las cifras " + aux + " es " + total);
				} else {
					int aux = valor1;
					int total = 0;
					while (valor1 != 0) {
						total = total + (valor1 % 10);
						valor1 = valor1 / 10;
					}
					System.out.println("La suma de las cifras " + aux + " es " + total);
				}
				System.out.println("******************************");
				break;

			case 2:
				System.out.println("Has elegido la opción 2.");

				// Parte 1
				char a;
				System.out.println("Inserte 1 caracter:");
				a = scan.next().charAt(0);
				System.out.println("    " + a + "\r " + "  " + a + a + a + " \r" + "  " + a + a + a + a + a + "\r" + " "
						+ a + a + a + a + a + a + a);

				// Parte 2
				System.out.println("***************************************************");
				int tamaño;
				int m = 1;
				System.out.println("Introduce tamaño de la matriz a pintar:");
				tamaño = scan.nextInt();
				for (int i = 0; i < tamaño; i++) {
					for (int j = 0; j < tamaño; j++) {
						System.out.print("\t" + m);
						m = m + 2;
					}
					System.out.println("");
				}

				// Parte 3
				System.out.println("***************************************************");
				System.out.println("\r" + "Matriz : \n");
				int filas = 0;
				int z = 0;
				z = tamaño;
				while ((tamaño >= 0) && (filas <= z)) {
					for (int i = tamaño; i > 0; i--) {
						System.out.print("*");
					}
					System.out.print("   ");

					for (int i = 1; i <= filas; i++) {
						System.out.print("*");
					}
					System.out.println();
					filas++;
					tamaño--;
				}
				System.out.println("***************************************************");
				break;
			case 3:
				System.out.println("Programa finalizado.");
				salir = true;
				break;

			default:
				System.out.println("Opción introducida es incorrecta.");
			}
		}
		scan.close();
	}
}