import java.util.Scanner;

public class Evalua_Edad {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		
		System.out.println ("Introduce una edad:");
			int edad=scan.nextInt();
		if (edad<18) {
			System.out.println ("Eres un adolocente.");
		}
		else if (edad<40) {
			System.out.println("Eres joven.");
		}
		else if(edad<65) {
			System.out.println ("Eres maduro.");
		}
		else {
			System.out.println ("Deberías cuidarte más.");
		}
		scan.close();
	}

}
