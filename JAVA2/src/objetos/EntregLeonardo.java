package objetos;
import java.util.*;
public class EntregLeonardo {
		private int dia;
		private int mes;
		private int a�o;
	public EntregLeonardo(int dia, int mes, int a�o) {	
		this.dia=dia;
		this.mes=mes;
		this.a�o=a�o;
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getA�o() {
		return a�o;
	}
	public void setA�o(int a�o) {
		this.a�o = a�o;
	}
	public boolean Bisiesto() {
		return (a�o % 4==0 && a�o % 100!=0 || a�o % 400==0);
	}
	public boolean calcFecha() {
		boolean diaBueno, mesBueno, a�oBueno;
		a�oBueno=a�o>0;
		mesBueno=mes>=1 && mes<=12;
		switch (mes) {
			case 2:
				if(Bisiesto()) {
					diaBueno=dia>=1 && dia<=29;
				}else {diaBueno=dia>=1 && dia<=28;} break;
			case 4:
			case 6:
			case 9:
			case 11:
				diaBueno=dia>=1 && dia <=30;
				break;
			default:
				diaBueno=dia>=1 && dia <=31;
		}
		return diaBueno && mesBueno && a�oBueno;
	}
	public void Escribir() {
		System.out.println(this.dia + "/" + this.mes + "/" + this.a�o);
	}
	public static void main (String[] args) {
		Scanner scan=new Scanner (System.in);
		//Creamos variables para sacar por pantalla dia, mes y a�o.
		System.out.println ("Introduzca un dia:");
			int dia=scan.nextInt();
		System.out.println ("Introduzca un mes:");
			int mes=scan.nextInt();
		System.out.println ("Introduzca un a�o:");
			int a�o=scan.nextInt();
		scan.close();
		//Utilizo la sentencia if y else para comprobar las fechas correctas y erroneas
		EntregLeonardo fecha = new EntregLeonardo(dia,mes,a�o);
		 if (fecha.calcFecha()){
			 System.out.println("Fecha Introducida: "  + dia + "/" + mes + "/" + a�o);
		 } else { System.out.println("Fecha Incorrecta: " + dia + "/" + mes + "/" + a�o); }
		 //fecha.Escribir();
		 System.out.println ("Es Bisiseto: " + fecha.Bisiesto());
	}
}
