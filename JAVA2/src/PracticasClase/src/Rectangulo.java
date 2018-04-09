import java.util.*;
public class Rectangulo {
		private float Lado1;
		private float Lado2;
	public Rectangulo (float lad1, float lad2){
		this.Lado1 = lad1;
		this.Lado2 = lad2;
	}
	
	public float getLado1() {
		return Lado1;
	}

	public void setLado1(float lado1) {
		Lado1 = lado1;
	}

	public float getLado2() {
		return Lado2;
	}

	public void setLado2(float lado2) {
		Lado2 = lado2;
	}
	public float calcArea () {
		return (this.Lado1 * this.Lado2);
	}
	
	public float calcPerimetro () {
		return ((this.Lado1*2)+(this.Lado2*2));
	}

	public boolean SioNo () {
		boolean cuadrado=false;
		if (this.getLado1()==this.getLado2()); cuadrado=true;
		return cuadrado;
	}	
	
	public void Escribir () {
		System.out.println (this.getLado1()+ "  " + this.getLado2());
	}
	public static void main (String[] args) {
		 Rectangulo dato1 = new Rectangulo (5,5);
		 System.out.println ("El area es " + dato1.calcArea() + " el perimetro es " + dato1.calcPerimetro());
		 System.out.println (dato1.SioNo());
	}		
}