import java.util.*;
public class Entrada_Ejemplo1 {

	public static void main (String[] args) {
		Scanner entrada=new Scanner(System.in);
			System.out.println("Introduce un nombre:");
				String nombre=entrada.nextLine();
			System.out.println("Introduce tu edad:");
				int edad=entrada.nextInt();
			System.out.println ("Hola " + nombre + ", el proximo a�o tendras " + (edad+1) + " a�os.");
			entrada.close();
	}
}
