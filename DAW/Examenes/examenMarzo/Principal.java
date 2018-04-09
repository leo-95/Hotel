package examenMarzo;

import java.util.*;

public class Principal {
	public static char genResultadoAleatorio() {
		List<Character> l=Arrays.asList('1','X','2');
		Collections.shuffle(l);
		return l.get(0);
	}
	public static void asignarResultados(Encuentro[] j) {
		for (int i=0; i<5;i++) {
			j[i].setResDescanso (genResultadoAleatorio());
			j[i].setResFinal(genResultadoAleatorio());
		}
	}

	public static void main(String[] args) {
		//a-Creamos un ArrayList de equipos
		List<String> varEquipos=new ArrayList<String>();
		String s="EQ-";
		for (int i=1;i<=10;i++) {
			varEquipos.add(s+i);
		}
		System.out.println("El array de equipos es:\n "+varEquipos);
		//b-Desordenamos la colección
		Collections.shuffle(varEquipos);
		System.out.println("Desordenamos la colección:\n "+varEquipos);

		//c-Inicializamos cinco objetos de datos
		Encuentro oEncuentro1=new Encuentro (varEquipos.get(0),varEquipos.get(1) );
		Encuentro oEncuentro2=new Encuentro (varEquipos.get(2),varEquipos.get(3) );
		Encuentro oEncuentro3=new Encuentro (varEquipos.get(4),varEquipos.get(5) );
		Encuentro oEncuentro4=new Encuentro (varEquipos.get(6),varEquipos.get(7) );
		Encuentro oEncuentro5=new Encuentro (varEquipos.get(8),varEquipos.get(9) );

		//d-Array de encuentros
		
		Encuentro[] jornada= {oEncuentro1, oEncuentro2,oEncuentro3,oEncuentro4,oEncuentro5};
		asignarResultados(jornada);
		
		System.out.println(Arrays.toString(jornada));
		Arrays.sort(jornada);
		System.out.println(Arrays.toString(jornada));
		
	}

}
