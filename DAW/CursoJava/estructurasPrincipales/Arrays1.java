package estructurasPrincipales;

public class Arrays1 {

	public static void main(String[] args) {
		
		/*
		
		//Primera forma de declarar arrays.
		
		int [] matriz= new int [5];
		
		matriz[0]=1;
		matriz[1]=14;
		matriz[2]=-12;
		matriz[3]=2;
		matriz[4]=24;
		
		*/

		//Segunda forma de declarar.
		
		int [] matriz= {1,14,-12,2,24,16,5,88,71,0,100};
		
		for (int i=0; i<matriz.length; i++) {
			System.out.println("Valor de índice "+ i + " = " + matriz[i]);
		}
	}
}
