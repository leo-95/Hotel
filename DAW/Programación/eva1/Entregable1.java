package eva1;

import java.util.Scanner;

public class Entregable1 {
	
	public static void main(String [] args) {
		
		Scanner datos=new Scanner (System.in);
		
		System.out.println("Introduzca un nombre:");
		String nomb=datos.nextLine();
		System.out.println("Introduza tres n�meros:");
		int num1=datos.nextInt();
		int num2=datos.nextInt();
		int num3=datos.nextInt();
		
		boolean mayor=(num1>num2);
		boolean result=((num1*num2)<num3);
		
		
		System.out.println("*****************************************************************************************\n");
		System.out.println("Mi nombre es: " +nomb+"\n");
		System.out.println("Los n�meros dados son:"+"\n");
		System.out.println("N�mero"+num1+"            "+"N�mero"+num2+"           "+"N�mero"+num3+"\n");
		System.out.println("Podemos decir que N�mero"+num1+" es mayor que N�mero"+num2+": "+mayor+"\n");
		System.out.println("Podemos decir que la multiplicaci�n de N�mero"+num1+" y N�mero"+num2+" es menor que N�mero"+num3+": "+result+"\n");
		System.out.println("\n*****************************************************************************************");
		
		datos.close();
		
	}

}
