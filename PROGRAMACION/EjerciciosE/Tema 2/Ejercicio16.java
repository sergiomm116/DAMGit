import java.util.Scanner;

public class Ejercicio16 {

	public static void main (String args[]) {

		// Initialize

		Scanner keyboard = new Scanner (System.in);

		boolean prime = true;

		System.out.print("Introduce un numero. Se van a imprimir primos entre 1 y el numero: ");

		int N = keyboard.nextInt();

		int D = N-1;

		String result = "";

		boolean first = true;



		// Loops and print

		for (; N>1; N--) {

			D = N-1;

			while (prime) {

				if (N%D == 0) prime = false;

				if (D == 1) {

					if (first) {
		
						result = N + result;

						prime = false;

						first = false;

					}	

					else {

						result = N + ", " + result;

						prime = false;	

					}			

				}

				D--;

			}

			prime = true;

		}

		System.out.print(result);

	}

}