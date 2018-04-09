package baseDD;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;


public class BaseDeDatos {
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String dni;

	public BaseDeDatos(String nombre, String apellido1, String apellido2, String dni) {
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	// Meter el select

	public static Connection conectar(Connection c) {
		String sDriver = "com.mysql.jdbc.Driver";
		String sURL = "jdbc:mysql://localhost:3306/hotel";

		try {
			Class.forName(sDriver).newInstance();
			c = DriverManager.getConnection(sURL, "root", "");

		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return c;
	}

	public void ConsultarClientes(String nombre, String apellido1, String apellido2, String dni) {

		Connection con = null;
		Statement stmt = null;
		try {
			con = conectar(con);
			stmt = (Statement) con.createStatement();
			ResultSet rs = ((java.sql.Statement) stmt).executeQuery("select * from hoteles");
			while (rs.next()) {
				System.out.println(rs.getInt("id_cliente") + "" + rs.getInt("apellido") + "" + rs.getString("nombre") + ""
						+ rs.getString("dni" + ""));

				this.nombre = rs.getString("nombre");
				this.apellido1 = rs.getString("apellid1");
				this.apellido2 = rs.getString("apellido2");
				this.dni = rs.getString("dni");
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
