package examenMarzo;

public class Encuentro implements Comparable<Encuentro>{
	private String equipo1;
	private String equipo2;
	private char resDescanso;
	private char resFinal;
	
	public Encuentro(String equipo1, String equipo2, char resDescanso, char resFinal) {
		super();
		this.equipo1 = equipo1;
		this.equipo2 = equipo2;
		this.resDescanso = resDescanso;
		this.resFinal = resFinal;
	}
	
	public Encuentro(String equipo1, String equipo2) {
		super();
		this.equipo1 = equipo1;
		this.equipo2 = equipo2;
	}

	public String getEquipo1() {
		return equipo1;
	}
	public void setEquipo1(String equipo1) {
		this.equipo1 = equipo1;
	}
	public String getEquipo2() {
		return equipo2;
	}
	public void setEquipo2(String equipo2) {
		this.equipo2 = equipo2;
	}
	public void setResDescanso(char c) {
		this.resDescanso=c;
	}
	public void setResFinal(char c) {
		this.resFinal=c;
	}
	public char getResFinal() {
		return this.resFinal;
	}
	@Override
	public String toString() {
		return "\nEncuentro: " + equipo1 + "  -  " + equipo2 + ": RD=" + resDescanso + " | RF="
				+ resFinal;
	}
	/*public int compareTo<Encuentro> (Encuentro e) {
		
	}*/

	@Override
	public int compareTo(Encuentro e) {
		char res1=this.getResFinal();
		char res2=e.getResFinal();
		int retorno=0;
		if (res1==res2) retorno=0;
		else if ((res1=='1')||(res2=='2')) retorno=-1;
		else if ((res2=='1')||(res1=='2')) retorno=1;
		return retorno;
	}

}

