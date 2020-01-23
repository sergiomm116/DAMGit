import java.util.*;

public class MetodosTest1 {

	static int i=1;					// Propiedad de clase para llamar a recursivo

	public static void main (String args[]) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce un numero: ");

		int numero = teclado.nextInt();

		cubo(numero);

		System.out.println("Done.");

		System.out.println("El factorial de " + numero + " es " + factorial(numero));

		System.out.println("Done 2.");

		tabla(numero);

		System.out.println("Done 3.");

		recursivo(i);

		System.out.println("Done 4.");

	}

	public static void cubo(int numero) {

		System.out.println(numero*numero*numero);

	}

	public static int factorial(int numero) {

		int resultado = 1;

		for (int i=2; i<numero; i++) {

			resultado*=i;

		}

		return resultado;

	}

	static void tabla (int numero) {

		for (int i=1; i<=10; i++) {

			System.out.printf("%2d x %2d = %2d\n", numero, i, producto(numero,i));

		}

	}

	static int producto (int numero, int i) {

		return numero*1;

	}

	static void recursivo(int i) {

		if (!(i==3)) {

			System.out.println("Recursivo: " + i);

			recursivo(++i);

			System.out.println("Acaba " + i);

		}

	}

}