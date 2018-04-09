
public class Persona {
		public String Nombre;
		public int Edad;
		public String Saludo;
		
	public Persona (String hol, String nom, int ed ) {
		this.Nombre = nom;
		this.Edad = ed;
		this.Saludo = hol;
	}
	public void despedirse(String ad) {
		this.Saludo = ad;
		
	}
	public void Escribir () {
		System.out.println (this.Saludo + " " + this.Nombre + " " + this.Edad);
	}
	public static void main(String[] args) {
		Persona persona1 = new Persona (" Hola ", " Leonardo", 25);
		persona1.Escribir();
		persona1.despedirse("Adios");
		persona1.Escribir();
		
	}
}
