import java.util.Scanner;

public class Ejercicio20 {

	public static void main (String args[]) {

		// Create Scanner, initialize size and the array

		Scanner keyboard = new Scanner(System.in);

		System.out.print("Introduce dimension del array: ");

		int size = keyboard.nextInt();

		int array[] = new int[size];



		// Generate random numbers and print them

		System.out.println("Los valores generados son: ");

		for (int i=0; i<size; i++) {

			array[i] = ((int) (Math.random()*300)) + 1;

			System.out.print(array[i] + ", ");

		}

		System.out.println("\b\b  ");



		// Search for the number

		System.out.print("Introduce un valor para buscar (1-300): ");

		int search = keyboard.nextInt();

		System.out.println("Se ha encontrado el valor solicitado en las siguientes posiciones:");

		boolean found = false;

		for (int i=0; i<size; i++) {

			if (array[i]==search) {

				System.out.print(i + ", ");

				found = true;

			}

		}

		System.out.print("\b\b  ");

		if (!found) System.out.println("Ninguna");

	}

}