import javax.swing.*;
public class AccesoAplicacion {

	public static void main(String[] args) {
		String clave="Juan";
		String pass="";
			while(clave.equals(pass)==false) {
						pass=JOptionPane.showInputDialog("Contraseña la clave:");
						if (clave.equals(pass)==false) {
							System.out.println ("Contraseña incorrecta.");
						}
			}
			System.out.println("Contraseña correcta. Acceso permitido.");
	}

}
