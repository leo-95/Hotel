package eva1;

import java.util.Scanner;

public class TablaMultiplicar {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Introduce una tabla de multiplicar:");
		int tabla = scan.nextInt();
		System.out.println("La tabla de multiplicar introducida es: " + tabla);
		for (int i = 1; i <= 10; i++) {
			System.out.println(tabla + " x " + i + " = " + (tabla * i));
		}
		scan.close();
	}

}
