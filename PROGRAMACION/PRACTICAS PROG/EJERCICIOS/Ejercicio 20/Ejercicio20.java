import java.util.Scanner;
import java.util.Arrays;

public class Ejercicio20 {
	
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
		int i = input.nextInt();
		int[] numeros = new int [i];
		
		for (int j = 0; j < i; j++){
			numeros[j] = (int)(Math.random()*299+1);
		}
		
		Arrays.sort(numeros);
		
		for (int n : numeros) {
			System.out.print(n+", ");
		}
		
		
		System.out.println();
		
		int x = input.nextInt();
		
		System.out.println(Arrays.binarySearch(numeros, x));
		
	}
}

