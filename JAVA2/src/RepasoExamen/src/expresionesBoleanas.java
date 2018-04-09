import java.util.*;
public class expresionesBoleanas {
	public static void main (String[] args) {
		Scanner scan=new Scanner(System.in);
		int x=1, z=7;
		System.out.println("Introduce un número del 1 al 7: ");
			int y=scan.nextInt();
		boolean dat=(x==z || x==y || z==y);
		if (dat) {
			System.out.println ("Esta dentro del intervalo.");
		} else {System.out.println ("No esta dentro del intervalo.");}
		
		scan.close();
	}
}
