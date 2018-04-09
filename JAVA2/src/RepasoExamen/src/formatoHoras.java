public class formatoHoras {
		private int horas;
		private int minutos;
		private int segundos;
		private String formato;
	 public formatoHoras (int HH, int mm, int ss, String ff){
		 this.horas=HH;
		 this.minutos=mm;
		 this.segundos=ss;
		 this.formato=ff;
	 }
	 
	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	public int getSegundos() {
		return segundos;
	}

	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

	public void format1() {
		if (this.horas==0) {
			System.out.println((this.horas+12)+":"+this.minutos+":"+this.segundos+" AM");
		}else if (this.horas==12) {
			System.out.println(this.horas+":"+this.minutos+":"+ this.segundos+" PM");
		}else if (this.horas>=0 && this.horas<12) {
			System.out.println(this.horas+":"+this.minutos+":"+ this.segundos+ " PM");
		}else {System.out.println((this.horas-12)+":"+this.minutos+":"+this.segundos+ " AM");} 
			
	}
	public void escribir() {
		System.out.println(this.horas +":"+this.minutos+":"+this.segundos+" "+this.formato);
	}
	public static void main(String[] args) {
		System.out.println("HORA 1:" + "\n================================");
		formatoHoras hora1=new formatoHoras(15,40,35,"PM");
		hora1.escribir();
		hora1.format1();
		System.out.println("HORA 2:" + "\n================================");
		formatoHoras hora2=new formatoHoras(9,10,15,"AM");
		hora2.escribir();
		//hora2.format();
			
	}
}
