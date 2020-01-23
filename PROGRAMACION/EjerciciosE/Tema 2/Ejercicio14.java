import java.util.Scanner;

public class Ejercicio14 {

	public static void main (String args[]) {

		// Inicializar contadores, variables y Scanner. Mensaje inicial.

		double posum = 0;

		double negum = 0;

		int posct = 0;

		int negct = 0;

		int zerct = 0;

		System.out.println("Introducir 10 numeros enteros...");

		Scanner keyboard = new Scanner(System.in);

		int number = 0;



		// Introduccion en bucle de números y guardado de valores

		for (int i = 0; i < 10 ; i++) {

			System.out.print("Introduce un numero: ");

			number = keyboard.nextInt();

			if (number > 0) {

				posum += number;

				posct++;

			}

			if (number < 0) {

				negum += number;

				negct++;

			}

			if (number==0) {

				zerct++;

			}

		}



		// Imprimir resultados


		if (posct > 0) {	// Condición para evitar excepciones por división entre 0

			System.out.println("Media de numeros positivos: " + (double) (posum/posct));

		}

		else {

			System.out.println("No se introdujeron numeros positivos");

		}		

		if (negct > 0) {

			System.out.println("Media de numeros negativos: " + (double) (negum/negct));

		}

		else {

			System.out.println("No se introdujeorn numeros negativos");

		}

		System.out.println("Cantidad de ceros introducidos: " + zerct);


	}

}