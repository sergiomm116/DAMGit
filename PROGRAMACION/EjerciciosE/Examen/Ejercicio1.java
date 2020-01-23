public class Ejercicio1 {
	
	public static void main (String args[]) {
		
		// Initialize variables
		
		char array[] = new char[6];
		
		boolean vowel = false;
		
		boolean repeat = true;
		
		
		
		// Loop to generate and test conditions
		
		while (!vowel | !repeat) {
			
			vowel = false;				// Reiniciar las condiciones para que no se asuman ya cumplidas a cada intento de generar una password
			
			repeat = true;
			
			// Generate
			
			for (int i=0; i<6; i++) {
				
				array[i] = (char) ((Math.random()*26)+97);
				
			}
			
			// Does it have a vowel?
			
			for (int i=0; i<6; i++) {
				
				if (array[i]==97 || array[i]==101 || array[i]==105 || array[i]==111 || array[i]==117) vowel=true;
				
			}
			
			// Does any char repeat?
			
			for (int i=0; i<6; i++) {
				
				for (int j=0; j<i; j++) {
					
					if (array[i]==array[j]) repeat = false;
					
				}
				
			}
			
		}
		
		
		
		// Print resulting password
		
		System.out.print("Password: ");
		
		for (int i=0; i<6; i++) {
			
			System.out.print(array[i]);
			
		}
		
	}

}
