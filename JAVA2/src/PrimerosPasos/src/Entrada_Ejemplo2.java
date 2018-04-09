import javax.swing.*;
public class Entrada_Ejemplo2 {
	public static void main (String[] args) {
		String nombre=JOptionPane.showInputDialog("Introduce tu nombre:");
		String edad=JOptionPane.showInputDialog("Introduce tu edad:");
		int edad_nombre=Integer.parseInt(edad);
		edad_nombre++;
			System.out.println ("Hola " + nombre + ", mañana cumplirás " + edad_nombre + " años.");
	}

}
