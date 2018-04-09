package eva3;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.Iterator;

public class ManejoPath {

	public static void main(String[] args) {
		try {
			FileSystem sistemaFicheros=FileSystems.getDefault();
			Path rutaFichero=sistemaFicheros.getPath("C:/PruebaFicheros/hola.txt");
			
			System.out.println("1-" +rutaFichero.getFileName());
			System.out.println("2-" +rutaFichero.getParent().getFileName());
			
			Path rutaDirectorio=sistemaFicheros.getPath("C:/PruebaFicheros/hola.txt");
			Iterator<Path> it=rutaDirectorio.iterator();
			
			while(it.hasNext()) {
				System.out.println("3-"+it.next().getFileName());
			}
		}
		catch(Exception e) {
			System.out.println("0-" + "el fichero no existe");
		}
	}

}
