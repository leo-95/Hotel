package eva1;

public class BuclesFor {

	public static void main(String[] args) {

		//a
		
		/*
		int i = 10;
		while (i > 0) {
			System.out.println(i);
			i = i - 2;
		}
		
		//Solución con for.
		 
		for (int j=10; j>0; j--) {
			System.out.println(j);
			j--;
		}
		
		*/

		// b
		
		/*
		 int i = 10; int j = 20; while (j > 1) { int k = i + 1; i = i * 2;
		 System.out.println(i + ", " + ", " + k); j = j - 1; }
		
		 */

		// c
	
		/*
		 boolean amor = true; int h = 1; while (amor || h <= 4) { if (amor) {
		 System.out.println("Me quiere :)"); } else {
		 System.out.println("No me quiere :( "); } amor = !amor; h++;
		 */
		 
		 
		 //Solución.
		
		 boolean amor=false;
		 for (int i=0; i<=4; i++) 
			 if (amor = !amor){
				 System.out.println("Me Quiere.");
			 }else {
				 System.out.println("No me Quiere.!"); 	 		
		}
	}
}
