import java.util.Scanner;

public class Ejercicio27 {

	static int suplimit = 0;

	public static void main (String args[]) {

		// Initialize

		Scanner keyboard =  new Scanner(System.in);

		System.out.print("Introduce limite inferior [entero]: ");

		int linf = keyboard.nextInt();

		System.out.print("Introduce limite superior [entero]: ");

		suplimit = keyboard.nextInt();



		// Apply method and print result

		System.out.println("La suma entre " + linf + " y " + suplimit + " es: " + suma(linf));

	}

	static int suma (int a) {

		if (a==suplimit) {

			return a;

		}

		else {

			return a + suma(++a);

		}

	}

}