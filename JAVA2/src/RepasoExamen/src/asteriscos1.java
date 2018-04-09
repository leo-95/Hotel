import java.util.*;
public class asteriscos1 {
	public static void main(String[] args) {
		int filas=0;
		Scanner scan=new Scanner (System.in);
		System.out.println ("Escriba un número por pantalla: ");
		int n=scan.nextInt();
		while (filas<=n){
			for (int i=1;i<=filas;i++)
				System.out.print('*');
			System.out.println();
			filas++;
		}
		scan.close();
	}	
}

