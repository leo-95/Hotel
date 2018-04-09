package poo;

public class Coche {

	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int pesoPlataforma;
	String color;
	int pesoTotal;
	boolean asientosCuero, Climatizador;

	public Coche() {
		ruedas = 4;
		largo = 2;
		ancho = 1;
		motor = 1600;
		pesoPlataforma = 800;

	}

	public String getColor() {
		return "Mi coche es de color "+color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
