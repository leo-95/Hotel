package objetos;

public class rectangulo {
		private float lado1;
		private float lado2;
	public rectangulo (float lad1, float lad2) {
		this.lado1=lad1;
		this.lado2=lad2;
	}
	public float getLado1() {
		return lado1;
	}
	public void setLado1(float lado1) {
		this.lado1 = lado1;
	}
	public float getLado2() {
		return lado2;
	}
	public void setLado2(float lado2) {
		this.lado2 = lado2;
	}
	public float calcArea () {
		return (this.lado1 * this.lado2);
	}
	public float calcPerimetro() {
		return ((this.lado1*2)+(this.lado2*2));
	}
	public boolean SiNo () {
		boolean cuadrado=false;
		if (this.lado1==this.lado2)  cuadrado =true;
		return cuadrado;
	}
	public void pintar () {
		for (int x=0; x<=this.lado1; x++ )
		{
			for (int y=0; y<=this.lado2; y++)
			{
				if (x==0 || x==this.lado1 || y==0 || y==this.lado2)
					{System.out.print (" *");}
					else {System.out.print("  ");}
			}
				System.out.println();}
		}
	public void Escribir() {
		System.out.println (this.getLado1() + "" + this.getLado2());
	}
	public static void main (String[] args) {
		rectangulo dato1 = new rectangulo (5,5);
		System.out.println ("El área es " + dato1.calcArea() + " y el perimtro " + dato1.calcPerimetro());
		System.out.println ("Es cuadrado " + dato1.SiNo());
		dato1.pintar();
	}

}
