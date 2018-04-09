package eva1;

import java.util.Scanner;

public class Entregable1 {
	
	public static void main(String [] args) {
		
		Scanner datos=new Scanner (System.in);
		
		System.out.println("Introduzca un nombre:");
		String nomb=datos.nextLine();
		System.out.println("Introduza tres números:");
		int num1=datos.nextInt();
		int num2=datos.nextInt();
		int num3=datos.nextInt();
		
		boolean mayor=(num1>num2);
		boolean result=((num1*num2)<num3);
		
		
		System.out.println("*****************************************************************************************\n");
		System.out.println("Mi nombre es: " +nomb+"\n");
		System.out.println("Los números dados son:"+"\n");
		System.out.println("Número"+num1+"            "+"Número"+num2+"           "+"Número"+num3+"\n");
		System.out.println("Podemos decir que Número"+num1+" es mayor que Número"+num2+": "+mayor+"\n");
		System.out.println("Podemos decir que la multiplicación de Número"+num1+" y Número"+num2+" es menor que Número"+num3+": "+result+"\n");
		System.out.println("\n*****************************************************************************************");
		
		datos.close();
		
	}

}
