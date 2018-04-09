package estructurasPrincipales;

import java.util.Scanner;

public class Arrays2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String[] paises = new String[5];

		for (int i = 0; i < paises.length; i++) {
			System.out.println("Introduce país " + (i + 1) + ":");
			paises[i] = scan.nextLine();
		}

		for (String elemento : paises) {
			System.out.println("País = " + elemento);
		}
		scan.close();
	}
}
