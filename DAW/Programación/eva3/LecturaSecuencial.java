package eva3;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LecturaSecuencial {

	public static void main(String[] args) {
		Path entrada = Paths.get("Programación/Ejemplo2.txt");
		Path salida = Paths.get("Programación/Salida3.txt");
		
		//Arrays de byte para leer todos los bytes del archivo.
		
		InputStream istream=null;
		OutputStream ostream=null;
		
		int c;
		
		try {
			//InputStream y OutputStream de java.io nos permite trabajar byte a byte.
			//Lo generamos de forma eficiente utilizando java.io
			istream = Files.newInputStream(entrada);
			ostream = Files.newOutputStream(salida);
			
			while ((c = istream.read()) != -1) {
				//Escribimos todos los bytes en el archivo de salida.txt
				//Despues de ejecutar comprobamos que es igual al de entrada.
				ostream.write(c);
			}
			
		}catch(IOException io) {
			System.err.println(io);
		}

	}

}
