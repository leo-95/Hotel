package estructurasPrincipales;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Condicionales_Figuras {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		System.out.println("Elige una opci�n:" + "\n 1.Cuadrado \n 2.Rect�ngulo \n 3.Tri�gulo \n 4.C�rculo");
		int figura=scan.nextInt();
		
		switch(figura) {
			case 1:
				int lado=Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado:"));
				System.out.println("El �rea del cuadrado es: " +Math.pow(lado, 2));
			break;
			case 2:
				int base=Integer.parseInt(JOptionPane.showInputDialog("Introduce la base:"));
				int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura:"));
				System.out.println("El �rea del rect�ngulo es: " +(base*altura));
				
			break;
			case 3:
				base=Integer.parseInt(JOptionPane.showInputDialog("Introduce la base:"));
				altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura:"));
				System.out.println("El �rea del rect�ngulo es: " +((base*altura)/2));
				
			break;
			case 4:
				int radio=Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio:"));
				System.out.printf("El �rea del ciruclo es: "+" %1.2f",Math.PI*(Math.pow(radio, 2)));
			break;
		default:
			System.out.println("La opci�n seleccionada es incorrecta.");
		}scan.close();
	}
}
