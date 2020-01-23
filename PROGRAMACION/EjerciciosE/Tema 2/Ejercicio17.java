import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String args[]) {

		// Initialize

		Scanner keyboard = new Scanner (System.in);

		System.out.print("Introduce un numero entero para calcular su factorial: ");		// Overflow a partir de 20

		int N = keyboard.nextInt();

		System.out.println();

		System.out.print("El factorial de " + N + " es ");


		
		// Calculate and print result

		long factorial = 1;

		for (;N>1;N--) {

			factorial *= N;

		}

		System.out.println(factorial);

	}

}