import java.util.*;
public class vocalConsonante {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Introduce una letra: ");
			char dat=scan.next().charAt(0);
		if (dat=='A'||dat=='E'||dat=='I'||dat=='O'||dat=='U'||dat=='a'||dat=='e'||dat=='i'||dat=='o'||dat=='u') {
			System.out.println("Es vocal.");
		}else {System.out.println("Es consonante.");}
		scan.close();
	}

}
