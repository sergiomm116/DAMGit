package Simulacro2;

import java.util.Arrays;

public class Ejercicio1 {
	
	public static int[] ordenarParImpar(int[] input) {
		
		int countev = 0;
		
		for (int value : input) {
			
			if (value%2==0) countev++;
			
		}
		
		int[] evenset = new int[countev];
		
		int[] oddset = new int[input.length-countev];
		
		int evendex = 0;
		
		int oddex = 0;
		
		for (int value : input) {
			
			if (value%2==0) {
				
				evenset[evendex] = value;
				
				evendex++;
				
			}
			
			else {
				
				oddset[oddex] = value;
				
				oddex++;
				
			}
			
		}
		
		ordenarMayMen(evenset);
		
		ordenarMayMen(oddset);
		
		evendex--; oddex--;
		
		for (int k=0; k<input.length; k++) {
			
			if (k<countev) {
				
				input[k] = evenset[evendex];
				
				evendex--;
				
			}
			
			else {
				
				input[k] = oddset[oddex];
				
				oddex--;
				
			}
			
		}
		
		return input;
		
	}
	
	public static void ordenarMayMen(int[] input) {
		
		int save = 0;
		
		for (int i=0; i<input.length-1; i++) {
			
			for (int j=i+1; j<input.length; j++) {
				
				if (input[i]<input[j]) {
					
					save = input[i];
					
					input[i] = input[j];
					
					input[j] = save;
					
				}
				
			}
			
		}
		
	}
	
	public static void main (String args[]) {
		
		int[] input = {-3, 4, 8, -7, 5, -23, 8, 6, -1};
		
		System.out.println(Arrays.toString(ordenarParImpar(input)));
		
	}

}
