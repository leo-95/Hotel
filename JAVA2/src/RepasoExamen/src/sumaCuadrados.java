
public class sumaCuadrados {

	public static void main(String[] args) {
		int num=1, cuadrado=0;
		long suma=0L;
		while (num<=100) {
			cuadrado=num*num;
			suma=suma+cuadrado;
			num++;
		}
			
		System.out.println("Suma de cuadrados: "+ cuadrado);
	}

}
