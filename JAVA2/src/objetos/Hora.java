package objetos;

public class Hora {
		private int horas;
		private int minutos;
		private int segundos;
	public Hora (int hor, int min, int seg) {
		this.horas=hor;
		this.minutos=min;
		this.segundos=seg;
	}
	public Hora () {
		this.horas=00;
		this.minutos=00;
		this.segundos=00;
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
	public void incrementaHora(int hor, int min, int seg) {
		int hs1=0, hs2=0, h=0, m=0, s=0;
			hs1=(this.horas*60)*60+(this.minutos*60)+this.segundos;
			hs2=(hor*60)*60+(min*60)+seg;
			
			h=(((hs1+hs2)/60)/60)%24;
			m=((hs1+hs2)/60)%60;
			s=(hs1+hs2)%60;
		System.out.println(h+":"+m+":"+s);
	}
	public int medianoche() {
		int s=0;
			s=(this.horas*60)*60+(this.minutos*60)+this.segundos;
		return s;
	}
	public void Escribir() {
		System.out.println (this.horas + ":" + this.minutos + ":" + this.segundos);
	}
	public static void main (String[] args) {
		Hora dato=new Hora(16,49,00);
		dato.Escribir();
		dato.incrementaHora(16,50,10);
		System.out.println (dato.medianoche() + " segundos." );
	}
}
	

