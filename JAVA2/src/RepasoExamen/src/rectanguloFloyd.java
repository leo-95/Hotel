import java.util.*;
public class rectanguloFloyd {

	public static void main(String[] args) {
		   int nFilas = 0;       
	        Scanner lector = new Scanner(System.in);
	        System.out.print("Introduce n�mero de filas: ");
	        nFilas=lector.nextInt();  // Lee el n�mero de filas.
	        int contador=0;// Los n�meros del tri�ngulo

	        for (int i = 1; i <= nFilas; i++)  // Recorre las filas
	        {
	            for(int j = 1; j <= i; j++)  // Recorre cada elemento de la fila
	            {
	                contador++;
	                System.out.print(" " + contador);// Imprime el n�mero actual en pantalla.
	            }
	            System.out.println("");//Salto a la siguiente fila
	        }
	        
	}
}
