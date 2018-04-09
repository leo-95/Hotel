public class multiplos {
	public static void main (String[] args) {
		int num=3;
		int cont=1;
		int suma=0;
		while (cont<=20) {
			System.out.println("Multiplo: " + cont + "\t Número:"+ num);
			suma=suma+num;
					
			cont++;
			num+=3;
		}
					
			System.out.println("Número de múltiplos son " +(cont-1)+ " y la suma total es: " + suma);
	}	
}
