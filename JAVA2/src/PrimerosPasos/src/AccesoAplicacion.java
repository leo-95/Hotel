import javax.swing.*;
public class AccesoAplicacion {

	public static void main(String[] args) {
		String clave="Juan";
		String pass="";
			while(clave.equals(pass)==false) {
						pass=JOptionPane.showInputDialog("Contraseņa la clave:");
						if (clave.equals(pass)==false) {
							System.out.println ("Contraseņa incorrecta.");
						}
			}
			System.out.println("Contraseņa correcta. Acceso permitido.");
	}

}
