package eva1;

public class NumerosImpares {

	public static void main(String[] args) {
		int dato = 1;

		while (dato <= 10) {
			if (dato % 2 != 0)
				System.out.println(dato);
			dato++;
		}
	}
}
