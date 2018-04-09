package estructurasPrincipales;
import java.util.*;
public class Partida {

	public static int jugada;
	private ArrayList<Character> ganadores;

	public Partida(){
		this.ganadores=new ArrayList<Character>();
	}
	public void setGanador(Character z) {
		this.ganadores.add(new Character (z));
	}
	@Override
	public String toString() {
		return "Partida [Ganadores:" + ganadores.toString() + "]";
	}
	public char obtenerGanador() {
		int Ganador1=0;
		int Ganador2=0;
		char Gana;
		for (Iterator<Character> it=this.ganadores.iterator();it.hasNext();) {
			Character obj=(Character)it.next();
			if (obj.charValue()=='A') Ganador1++;
			else if (obj.charValue()=='B')Ganador2++;
		}
		if (Ganador1>Ganador2)Gana='A';
		else if (Ganador2>Ganador1)Gana='B';
		else Gana='E';
		return Gana;
	}
	
}

