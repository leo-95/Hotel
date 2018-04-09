package eva3;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LecturaCaracteres {

	public static void main(String[] args) {
		Path entrada = Paths.get("Programación/Ejemplo2.txt");
		Path salida = Paths.get("Programación/Salida2.txt");
		
		//Lista de cadenas para leer las lineas.
		
		List <String> fileLista;
		Charset charset;
		
		try {
			charset = Charset.forName("UTF-8");
			
			//Leemos de una vez un archivo entero de caracteres  utilizando java.nio
			fileLista = Files.readAllLines(entrada);
			
			//Escribimos una vez un archivo entero de caracteres utilizando java.nio
			Files.write(salida, fileLista, charset);
		}catch(IOException io) {
			System.err.println(io);
		}

	}

}
