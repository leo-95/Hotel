package objetos;

public class Circulo {
		private float radio;
	public Circulo (float rad) {
		this.radio=rad;		
	}
	public float getRadio() {
		return radio;
	}
	public void setRadio(float radio) {
		this.radio = radio;
	}
	public float calcArea() {
		return (float) (Math.PI * this.radio*this.radio);
	}
	public float calcPerimetro() {
		return (float) (Math.PI *(2*this.radio));
	}
	public void Escribir() {
		System.out.println(this.getRadio());
	}
	public static void main (String[] args) {
		Circulo dato=new Circulo (25);
		System.out.println ("El área es " + dato.calcArea() + " y el perímetro " + dato.calcPerimetro());		
	}
}

