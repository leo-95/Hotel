package estructurasPrincipales;

import java.util.Scanner;

public class PesoHyM {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String genero = "";

		do {
			System.out.println("Introduce tu género(H/M):");
			genero = scan.nextLine();
		} while (genero.equalsIgnoreCase("H") == false && genero.equalsIgnoreCase("M") == false);
		System.out.println("Introduce altura en cm:");
		int altura = Integer.parseInt(scan.nextLine());

		int pesoideal = 0;

		if (genero.equalsIgnoreCase("H")) {
			pesoideal = altura - 110;
		} else if (genero.equalsIgnoreCase("M")) {
			pesoideal = altura - 120;
		}
		System.out.println("Tu peso ideal es " + pesoideal + " Kg.");
		scan.close();
	}
}
