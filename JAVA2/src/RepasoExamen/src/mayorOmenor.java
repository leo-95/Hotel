import java.util.*;
public class mayorOmenor {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println ("Introduce el primer n�mero:");
			int x=scan.nextInt();
		System.out.println ("Introduce el segundo n�mero:");
			int y=scan.nextInt();
		if (x>=y) {
			System.out.println("El n�mero " + x + " es mayor que " + y + ".");
		}else {System.out.println("El n�mero " + x + " es menor que " + y + ".");}
		
		scan.close();
	}

}
