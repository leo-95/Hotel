import java.util.Scanner;

public class Producto {
		public int Codigo;
		public String Tipo;
		public String Descripcion;
		public int Cantidad;
		public int StockMinimo;
		public float Precio;
		
	public Producto (int cod, String tip, String desc, int cant, int stck, float pre){
		this.Codigo = cod;
		this.Tipo = tip;
		this.Descripcion = desc;
		this.Cantidad = cant;
		this.StockMinimo = stck;
		this.Precio = pre;		
		}
	
	public void Escribir () {
			System.out.println(this.Codigo + "" + this.Tipo + "" + this.Descripcion + "" + this.Cantidad + "" + this.StockMinimo + "" + this.Precio);
		}
	
	public static void main (String [] args) {
		Scanner scan=new Scanner (System.in);
		int cod, cant, stck;
		String tip, desc;
		float pre;
			System.out.println ("Introduce el codigo:");
		cod=scan.nextInt();
			System.out.println ("Introduce el tipo:");
		tip=scan.next();
			System.out.println ("Introduce una descripcion:");
		desc=scan.next();
			System.out.println ("Introduce una cantidad:");
		cant=scan.nextInt();
			System.out.println ("Cantidad en Stock:");
		stck=scan.nextInt();
			System.out.println ("Introduce precio:");
		pre=scan.nextInt();		
	}
}