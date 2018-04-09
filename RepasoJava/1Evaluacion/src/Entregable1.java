import java.util.*;
public class Entregable1 {
	public static void main (String[] args) {
		Scanner scan=new Scanner (System.in);
		System.out.println("Escribe un nombre:");
		String nombre=scan.next();
		System.out.println("Escribe tres numeros:");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		int num3=scan.nextInt();
		boolean mayor=(num1>num1);
		boolean x=((num1*num2)<num3);
		System.out.println("*********************************************************************");
		System.out.println("Mi nombre es: " +nombre+ "\n" + "Los números dados son:" + "\n" 
		+"Número"+ num1+   "  Número"+num2+  "  Número"+num3);
		System.out.println("Podemos decir que " +num1+ " es mayor que "+num2+": " +mayor);
		System.out.println("Podemos decir que la multiplicación de " + num1 + " por " + num2 + " es menor que " +num3+": " +x);
		System.out.println("*********************************************************************");
		scan.close();
	}
}
