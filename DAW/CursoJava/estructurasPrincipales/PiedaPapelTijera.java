package estructurasPrincipales;

import java.util.*;

public class PiedaPapelTijera {

	public static void main(String[] args) {
		/*
		ArrayList <String> val1=new ArrayList(); //Creamos el primera Array para el Jugador1
		val1.add("Piedra");
		val1.add("Papel");
		val1.add("Tijera");
		
		Partida varP=new Partida();
		varP.jugada=0;
		
		List <String> val2=Arrays.asList("Piedra","Papel","Tijera");//Creamos el segundo Array para el Jugador2.
		while (varP.jugada<10){
		Collections.shuffle(val1);//Con shuffle comparamos los dos jugadores.
		Collections.shuffle(val2);
			String auxVal1=(String)val1.get(0);
			String auxVal2=(String)val2.get(0);
		
		if (auxVal1.equals(auxVal2)) {
				varP.setGanador('E');
			}else if
				((auxVal2.equals("Piedra")&&auxVal1.equals("Papel"))||
				(auxVal2.equals("Papel")&&auxVal1.equals("Tijera"))||
				(auxVal2.equals("Tijera")&&auxVal1.equals("Piedra"))) 
			{varP.setGanador('A');}
			else {
				varP.setGanador('B');}
			varP.jugada++;
		}
		System.out.println(varP.toString());
		System.out.println("El Ganador es: " + varP.obtenerGanador());
	}
}*/

		
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		//Declaramos las variables.
		String jugador = "";
		String maquina = "";
		
		//Datos Jugador
		while (!(jugador.equals("piedra") || jugador.equals("papel") || jugador.equals("tijera"))) {
			System.out.println("Jugador  ('piedra','papel','tijera'):");
			jugador = scan.nextLine();
		}
		//Datos Maquina.
		switch (rand.nextInt(3)) {
		case 0:
			maquina = "piedra";
			break;
		case 1:
			maquina = "papel";
			break;
		case 2:
			maquina = "tijera";
			break;
		}
		
		System.out.println("*******************************************");
		System.out.println("\t Jugador: " + jugador);
		System.out.println("\t Máquina: " + maquina + "\n");
		Comparar(jugador, maquina);
		System.out.println("*******************************************");
		scan.close();
	}
	public static void Comparar(String ingreso1, String ingreso2) {
		if (ingreso2.equals(ingreso1)) {
			System.out.println("Empate.!");
		} else {
			if (ingreso1.equals("piedra")) {
				if (ingreso2.equals("tijera")) {
					System.out.println("Gana Piedra.!");
				} else {
					System.out.println("Gana Papel.!");
				}
			}
			if (ingreso1.equals("papel")) {
				if (ingreso2.equals("piedra")) {
					System.out.println("Gana Papel.!");
				} else {
					System.out.println("Gana Tijera.!");
				}
			}
			if (ingreso1.equals("tijera")) {
				if (ingreso2.equals("papel")) {
					System.out.println("Gana Tijera.!");
				} else {
					System.out.println("Gana Piedra.!");
				}
			}
		}
	}
}
