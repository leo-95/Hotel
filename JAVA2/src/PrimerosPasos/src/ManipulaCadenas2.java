
public class ManipulaCadenas2 {
	public static void main (String[] args) {
		String frase="Hoy es un dia estupendo para aprender a programar en java.";
		String frase_resum=frase.substring (0, 29) + "ir a la playa" + " y " + frase.substring(29, 58);
		System.out.println (frase_resum);
	}
}
