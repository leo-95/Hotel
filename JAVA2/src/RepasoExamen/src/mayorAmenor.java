import java.util.*;
public class mayorAmenor {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Introduce el primer valor:");
			int num1=scan.nextInt();
		System.out.println("Introduce el segundo valor:");
			int num2=scan.nextInt();
		System.out.println("Introduce el tercer valor:");
			int num3=scan.nextInt();
		if (num1>=num2 && num2>=num3) {
			System.out.println("El orden de los números de mayor a menor: " + num1+", "+num2+", "+ num3+".");
		} else {
			if (num1>=num3 && num3>=num2) {
				System.out.println("El orden de los números de mayor a menor: " + num1+", "+ num3+", "+ num2+".");
			} else {
				if (num2>=num1 && num1>=num3) {
					System.out.println("El orden de los números de mayor a menor: " + num2+", "+ num1+", "+ num3+".");
				} else {
					if (num2>=num3 && num3>=num1) {
						System.out.println("El orden de los números de mayor a menor: " + num2+", "+ num3+", "+ num1+".");
					} else {
						if (num3>=num1 && num1>=num2) {
							System.out.println("El orden de los números de mayor a menor: " + num3+", "+ num1+", "+ num2+".");
						} else {
							System.out.println("El orden de los números de mayor a menor: " + num3+", "+ num2+", "+ num1+".");
						}
					}
				}
			}
		}
		scan.close();
	}

}
