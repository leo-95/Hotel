package eva1;

import java.util.Scanner;

public class ExpresionesBooleanas {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		// a
		/*System.out.println("Introduce un intervalo del 1 al 7:");
		int num0 = entrada.nextInt();

		int num1 = 1;
		int num2 = 7;
		
		boolean dato = (num1 == num2 || num1 == num0 || num2 == num0);
		if (dato) {
			System.out.println("Intervalo introducido correctamente.!");
		} else {
			System.out.println("Número introducido no esta dentro del intervalo.!");
		}*/
		
		//b
		System.out.println("Introduce un número par:");
		int entero=entrada.nextInt();
		
		boolean resultado=(entero%2==0);
		
		if(resultado) {
			System.out.println(resultado);
		}else {
			System.out.println(resultado);
		}
		entrada.close();
	}
}
