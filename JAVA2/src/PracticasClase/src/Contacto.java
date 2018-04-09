
public class Contacto {
		public String Apellido;
		public String Nombre;
		public String Tlf;
	
	public Contacto (String ap, String nom, String tele) {
			this.Apellido = ap;
			this.Nombre = nom;
			this.Tlf = tele;	
	}
	public void ModAp (String ap) {
		this.Apellido = ap;
		
	}
	
	public void Escribir() {
			System.out.println (this.Apellido + "" + this.Nombre + "" + this.Tlf);
	}
	
	public static void main (String [] args) {
			Contacto persona1 = new Contacto (" Calva ", " Leonardo ", " 123456789 ");
			persona1.Escribir();
			persona1.ModAp ("Jaramillo");
			persona1.Escribir();
			
	}
	

	
}
