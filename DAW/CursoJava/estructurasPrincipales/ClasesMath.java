package estructurasPrincipales;

public class ClasesMath {

	public static void main(String[] args) {
		
		//Math parte 1.
		int raiz=(int)Math.sqrt(5);
		System.out.println("La raiz de '5' es: " +raiz);
		
		//Math para redondear parte 2.
		double num=5.85;
		int result=(int)Math.round(num);
		System.out.println("El " +num+ " redondeado es: " + result);
		
		//Math parte 3. (Base y exponente)
		double base=5;
		double expo=3;
		int resultado=(int)Math.pow(base, expo);
		System.out.println("El resultado de "+base+" elevado a "+expo+ " es: "+resultado);
	}

}
