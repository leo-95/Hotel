package objetos;

import java.util.Random;

public class LanzamientoDado {
	
	public static void main (String[] args) {
		int result=0,  piedra=1, papel=2, tijera=3;
		Random obj= new Random();
		result=((int)(obj.nextDouble()*3+1));
		System.out.println(result);

	if(result==piedra) {
		System.out.println("Piedra");
	}if(result==papel) {
		System.out.println("Papel");}
	if(result==tijera) {
		System.out.println("Tijera");}
}
}
