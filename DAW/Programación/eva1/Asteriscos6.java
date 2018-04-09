package eva1;

import java.util.Scanner;

public class Asteriscos6 {

	public static void main(String[] args) {
		Scanner figura=new Scanner (System.in);
		int filas=0;
		System.out.println("Escriba numero deseado:");
		int num=figura.nextInt();
		while (filas <= num) {
			for (int i=num; i>filas; i--)
			System.out.print('*');
			System.out.println();
			filas ++;
		}
	figura.close();
	}		
}