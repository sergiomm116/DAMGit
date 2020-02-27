package Simulacro2;

import java.util.Arrays;

public class Ejercicio3 {
	
	public static int sumaArray(int[] input) {
		
		int sum = 0;
		
		if(input.length>1) {
			
			int[] arrayr = Arrays.copyOf(input, input.length-1);
			
			return sum += input[input.length-1] + sumaArray(arrayr);
			
		}
		
		else return input[0];
		
	}
	
	public static void main (String args[]) {
		
		int[] arraytest = {6,7,8,-7,15,-29};
		
		System.out.println(sumaArray(arraytest));
		
	}

}
