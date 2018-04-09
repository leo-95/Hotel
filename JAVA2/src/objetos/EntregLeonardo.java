package objetos;
import java.util.*;
public class EntregLeonardo {
		private int dia;
		private int mes;
		private int año;
	public EntregLeonardo(int dia, int mes, int año) {	
		this.dia=dia;
		this.mes=mes;
		this.año=año;
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
	public int getAño() {
		return año;
	}
	public void setAño(int año) {
		this.año = año;
	}
	public boolean Bisiesto() {
		return (año % 4==0 && año % 100!=0 || año % 400==0);
	}
	public boolean calcFecha() {
		boolean diaBueno, mesBueno, añoBueno;
		añoBueno=año>0;
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
		return diaBueno && mesBueno && añoBueno;
	}
	public void Escribir() {
		System.out.println(this.dia + "/" + this.mes + "/" + this.año);
	}
	public static void main (String[] args) {
		Scanner scan=new Scanner (System.in);
		//Creamos variables para sacar por pantalla dia, mes y año.
		System.out.println ("Introduzca un dia:");
			int dia=scan.nextInt();
		System.out.println ("Introduzca un mes:");
			int mes=scan.nextInt();
		System.out.println ("Introduzca un año:");
			int año=scan.nextInt();
		scan.close();
		//Utilizo la sentencia if y else para comprobar las fechas correctas y erroneas
		EntregLeonardo fecha = new EntregLeonardo(dia,mes,año);
		 if (fecha.calcFecha()){
			 System.out.println("Fecha Introducida: "  + dia + "/" + mes + "/" + año);
		 } else { System.out.println("Fecha Incorrecta: " + dia + "/" + mes + "/" + año); }
		 //fecha.Escribir();
		 System.out.println ("Es Bisiseto: " + fecha.Bisiesto());
	}
}
