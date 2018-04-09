import java.util.*;
public class dosFechas {
	public static void main (String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Introduce la primera fecha: ");
			int d=scan.nextInt();
			int m=scan.nextInt();
			int a=scan.nextInt();
		System.out.println("Introduzca la segunda fecha: ");
			int d2=scan.nextInt();
			int m2=scan.nextInt();
			int a2=scan.nextInt();
		scan.close();
		if (d+m+a>d2+m2+a2) {
			System.out.println(d+"/"+m+"/"+a+ " es posterior a " +d2+"/"+m2+"/"+a2);
		}else {System.out.println(d+"/"+m+"/"+a+ " es inferior a " +d2+"/"+m2+"/"+a2);}
	}
}
