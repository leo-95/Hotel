package eva1;

import java.util.Scanner;

public class HorasYminutosAsegundos {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		int hora1, minutos2;
		System.out.println("Introduce Horas:");
		hora1=scan.nextInt();
		System.out.println("Introduce Minutos:");
		minutos2=scan.nextInt();
		
		int hora=hora1*60*60;
		int minutos=minutos2*60;
		int resultado=(hora+minutos);
		
		System.out.println("*****************Resultado********************\n");
		System.out.println(+hora1+" horas " +minutos2+ " minutos son: "+resultado+" segundos." );
		System.out.println("\n**********************************************");
		scan.close();

	}

}
