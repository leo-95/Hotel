import java.util.*;
public class parOimpar {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
			System.out.println ("Introduce un numero: ");
				int x=scan.nextInt();
			if (x%2==0) 
			{
				System.out.println ("Es un n�mero PAR.");
			}
			else {System.out.println ("Es un n�mero IMPAR.");}
			
			scan.close();
	}

}
