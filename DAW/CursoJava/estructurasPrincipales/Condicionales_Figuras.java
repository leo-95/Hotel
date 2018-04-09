package estructurasPrincipales;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Condicionales_Figuras {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		System.out.println("Elige una opción:" + "\n 1.Cuadrado \n 2.Rectángulo \n 3.Triágulo \n 4.Círculo");
		int figura=scan.nextInt();
		
		switch(figura) {
			case 1:
				int lado=Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado:"));
				System.out.println("El área del cuadrado es: " +Math.pow(lado, 2));
			break;
			case 2:
				int base=Integer.parseInt(JOptionPane.showInputDialog("Introduce la base:"));
				int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura:"));
				System.out.println("El área del rectángulo es: " +(base*altura));
				
			break;
			case 3:
				base=Integer.parseInt(JOptionPane.showInputDialog("Introduce la base:"));
				altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura:"));
				System.out.println("El área del rectángulo es: " +((base*altura)/2));
				
			break;
			case 4:
				int radio=Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio:"));
				System.out.printf("El área del ciruclo es: "+" %1.2f",Math.PI*(Math.pow(radio, 2)));
			break;
		default:
			System.out.println("La opción seleccionada es incorrecta.");
		}scan.close();
	}
}
