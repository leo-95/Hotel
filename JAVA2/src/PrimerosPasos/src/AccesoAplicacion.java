import javax.swing.*;
public class AccesoAplicacion {

	public static void main(String[] args) {
		String clave="Juan";
		String pass="";
			while(clave.equals(pass)==false) {
						pass=JOptionPane.showInputDialog("Contrase�a la clave:");
						if (clave.equals(pass)==false) {
							System.out.println ("Contrase�a incorrecta.");
						}
			}
			System.out.println("Contrase�a correcta. Acceso permitido.");
	}

}
