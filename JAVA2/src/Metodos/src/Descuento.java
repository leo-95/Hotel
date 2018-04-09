import java.util.*;
public class Descuento {
	public static int descuento (int cantidad) {
		int desc=0;
		if (cantidad<=25) desc=0;
		else if ((cantidad>=25)&&(cantidad<=50)) desc=10;
		else if ((cantidad>=50)&&(cantidad<=100)) desc=15;
			return desc;
	}
	public static float calcularDesc (int cantidad, int descuento) {
		float total=0;
		total= cantidad-(cantidad*descuento)/100;
			return total;
	}
	public static void main (String[] args) {
		Scanner scan=new Scanner (System.in);
		int cant=0;
		float precio=0;
			System.out.println ("Escribe la cantidad ha pagar: ");
				cant=scan.nextInt();
				precio=calcularDesc (cant, descuento(cant));
			System.out.println ("El precio final es: " + precio + " € ");
				scan.close();
	}
}

