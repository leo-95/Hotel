import java.util.*;
public class numeroNombre {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		System.out.println("Introduce un número:");
			int num=scan.nextInt();
		switch(num){
			case 1: System.out.println("UNO");break;
			case 2: System.out.println("DOS");break;
			case 3: System.out.println("TRES");break;
			default: System.out.println("NOSÉ");break;		
		}
		scan.close();
	}

}
