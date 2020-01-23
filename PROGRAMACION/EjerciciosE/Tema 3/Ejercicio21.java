import java.util.Scanner;

public class Ejercicio21 {

	public static void main (String args[]) {

		// Initialize size with keyboard

		Scanner keyboard = new Scanner(System.in);

		System.out.print("Introduce dimension de los arrays: ");

		int size = keyboard.nextInt();

		int arraynum[] = new int[size];

		char arraychar[] = new char[size];

		System.out.println();



		// Set random values independently - should be able to do it in the same loop tho

		for (int i=0; i<size; i++) {

			arraynum[i] = (int) ((Math.random()*25)+97);

			arraychar[i] = (char) ((Math.random()*25)+97);

		}



		// Print values stored

		System.out.println("---Valores numericos generados---");

		for (int i=0; i<size; i++) {

			System.out.print(arraynum[i] + ", ");

		}

		System.out.println("\b\b  ");

		System.out.println("---Caracteres generados---");

		for (int i=0; i<size; i++) {

			System.out.print(arraychar[i] + ", ");

		}

		System.out.println("\b\b  ");

		System.out.println();



		// Print matches

		System.out.println("---Coincidencias encontradas---");

		boolean found = false;

		for (int i=0; i<size; i++) {

			if (arraynum[i]==((int) (arraychar[i]))) {

				System.out.print(i + ", ");

				found = true;

			}

		}

		System.out.println("\b\b  ");

		if (!found) System.out.print("Ninguna");

	}

}