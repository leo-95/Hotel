package cantantes;

import java.util.ArrayList;

public class ListaCantantesFamosos {

	private String listaCantantes;
	private ArrayList<String> listasCantantes;

	// contructor

	public ListaCantantesFamosos() {
		listaCantantes = "Cantantes de Rock&HevyMetal Famosos:";
		listasCantantes = new ArrayList<String>();
		listasCantantes.add("Metallica");
		listasCantantes.add("Iron Maiden");
		listasCantantes.add("Ac/Dc");
		listasCantantes.add("Linkin Park");
	}

	public ArrayList<String> getListaCantantes() {

		return listasCantantes;
	}

	 public int getTamaño() {
	       
	        return listasCantantes.size();
	    }
	public String getNombreLista() {

		return listaCantantes;
	}
	public void imprimirLista() {
		System.out.println("\n" +getNombreLista()+"\n");	
		for (int i=0; i<getTamaño(); i++) {
			System.out.println((i+1)+"- "+getListaCantantes().get(i));
		}
	}

	public void añadirNombre(String palabra) {
		// TODO Auto-generated method stub
		
	}
}
