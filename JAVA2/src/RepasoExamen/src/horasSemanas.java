
public class horasSemanas {
	public static void main (String[] args) {
		int s, d, h, total=1000;
		s=total / (24*7);
		d=total % (24*7) / 24;
		h=total % 24;
		
		System.out.println ( "1000 horas son: " + s + " semanas " + d + " días " + h + " horas.");
		
	}
}
