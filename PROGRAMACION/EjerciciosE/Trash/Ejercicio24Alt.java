import java.util.Scanner;

public class Ejercicio24Alt {

	public static void main (String args[]) {

		// Initialize

		String input = "";

		Scanner keyboard = new Scanner(System.in);

		int storage[] = new int[25];

		

		// Input

		System.out.print("Introduce frase para contar caracteres: ");

		input = keyboard.nextLine();

		input = input.toLowerCase();



		// Read and store letters

		for (int i=0; i<input.length(); i++) {

			if (input.charAt(i)<97 || input.charAt(i)>122) continue;

			storage[input.charAt(i)-97]++;

		}



		// Output

		for (int i=0; i<25; i++) {

			if (storage[i]!=0) {

				System.out.print("Letra: " + (char) (i+97) + "\t Numero ocurrencias: " + storage[i]);

				System.out.println();

			}

		}

	}

}