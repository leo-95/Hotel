package eva3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LecturaBytes {

	public static void main(String[] args) {
		Path salida = Paths.get("Programación/Ejemplo2.txt");
		String s= "Esta es otra linea a escribir en el fichero";
		byte [] b=s.getBytes();
		
		//Leemos lo escrito en una lista.
		Path entrada = Paths.get("Programación/Ejemplo.txt");
		List <String> texto;
		
		try {
			Files.write(salida, b);
			texto=Files.readAllLines(entrada);
				System.out.println("Texto leído del fichero: " +texto);
				
		}catch (IOException io) {
			System.err.println(io);
		}

	}

}
