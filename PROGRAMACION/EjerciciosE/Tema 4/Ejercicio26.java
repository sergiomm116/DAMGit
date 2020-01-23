import java.util.Scanner;

public class Ejercicio26 {

	static int sum = 0;					// Propiedad para almacenar sumas

	static int suma (int a, int b) {			// Método de sumas recursivo

		sum += b;		// Suma al total b

		if (a!=b) {

			suma(a,--b);	// Se vuelve a llamar a suma reduciendo "b", solo si "b" no ha igualado ya a "a"

		}

		return sum;		// En caso contrario, se saltará una nueva llamada (tras haber sumado el valor que sí iguala a "a") y hace el return

	}

	public static void main (String args[]) {

		// Initialize

		Scanner keyboard = new Scanner(System.in);

		int a = 0;

		int b = 0;

		int dummy = 0;

		System.out.print("Introduce uno de los extremos de la suma [entero]:");

		a = keyboard.nextInt();

		System.out.print("Introduce el otro extremo de la suma [entero]:");

		b = keyboard.nextInt();

		if (b<a) {		// Arreglar los argumentos para el uso del método

			dummy = b;

			b = a;

			a = dummy;

		}



		// Call for the method and print

		System.out.println("------------------------------");

		System.out.println("La suma total es: " + suma(a,b));

	}

}