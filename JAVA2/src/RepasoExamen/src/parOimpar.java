import java.util.*;
public class parOimpar {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
			System.out.println ("Introduce un numero: ");
				int x=scan.nextInt();
			if (x%2==0) 
			{
				System.out.println ("Es un número PAR.");
			}
			else {System.out.println ("Es un número IMPAR.");}
			
			scan.close();
	}

}
