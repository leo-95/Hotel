package objetos;

public class Contactos {
		String Nombre;
		String Apellido;
		String Tlf;
	public Contactos(String nom, String ap, String tl) {
		this.Nombre=nom;
		this.Apellido=ap;
		this.Tlf=tl;
	}
	public void modificar(String ap) {
		this.Apellido=ap;
	}
	public void Escribir() {
		System.out.println (this.Nombre + "" + this.Apellido + "" + this.Tlf);
	}
	public static void main (String[] args) {
		Contactos dato1 = new Contactos ("Leonardo ", " Calva ", "123456789");
		dato1.Escribir();
		dato1.modificar(" Jaramillo ");
		dato1.Escribir();
	}
}
