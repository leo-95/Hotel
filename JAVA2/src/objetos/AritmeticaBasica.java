package objetos;

public class AritmeticaBasica {
		private double operando1;
		private double operando2;
		
	public AritmeticaBasica( double op1, double op2) {
		this.operando1=op1;
		this.operando2=op2;
	}
	public double getOperando1() {
		return operando1;
	}
	public void setOperando1(double operando1) {
		this.operando1 = operando1;
	}
	public double getOperando2() {
		return operando2;
	}
	public void setOperando2(double operando2) {
		this.operando2 = operando2;
	}
	public double calcSuma() {
		return (this.operando1 + this.operando2);
	}
	public double calcResta() {
		return (this.operando1 - this.operando2);
	}
	public double calcMultiplicacion() {
		return (this.operando1 * this.operando2);
	}
	public void Escribir () {
		System.out.println (this.getOperando1() + " " + this.getOperando2());
	}
	public static void main (String[] args) {
		AritmeticaBasica dato=new AritmeticaBasica (10,4);
		System.out.println(dato.getOperando1() + " + " + dato.getOperando2() + " = " + dato.calcSuma());
		System.out.println(dato.getOperando1() + " - " + dato.getOperando2() + " = " + dato.calcResta());
		System.out.println(dato.getOperando1() + " * " + dato.getOperando2() + " = " + dato.calcMultiplicacion());
	}
}
 