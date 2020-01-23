public class Ejercicio3 {
	
	public static void main (String args[]) {
		
		// Initialize and create vowels array
		
		char array[] = new char[10];
		
		char vowels[] = {97,101,105,111,117};	// Valores de vocales, como no se pueden repetir, los metemos manualmente
		
		int set = 0;
		
		int randomsave = 0;
		
		
		
		// Set the random array
		
		while (set < 5) {
			
			randomsave = (int) (Math.random()*10);
			
			if ((int) array[randomsave]==0) {
				
				array[randomsave] = vowels[set];
				
				set++;
				
			}
			
		}
		
		
		
		// Outputs
		
		System.out.print("[");
		
		for (int i=0; i<10; i++) {
			
			System.out.print((char) array[i] + ",");
			
		}
		
		System.out.println("\b]");
		
	}

}
