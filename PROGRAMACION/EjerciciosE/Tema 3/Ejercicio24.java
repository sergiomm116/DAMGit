import java.util.Scanner;

public class Ejercicio24 {

	public static void main (String args[]) {

		// Initialize

		Scanner keyboard =  new Scanner(System.in);

		String input = "";

		String answer = "";

		int counter = 0;

		boolean secure = true;



		// Input

		System.out.print("Introduce una cadena para contar sus caracteres: ");

		input = keyboard.nextLine();

		for (int i=0; i<input.length(); i++) {

			if (input.charAt(i)<97 || input.charAt(i)>122) {

				secure = false;

			}

		}

		if (!secure) System.out.println("!!! - La entrada contiene caracteres fuera de rango [a-z] [A-Z], que esta clase no deberia contar - !!!");

		System.out.println();



		// Process string

		input = input.toLowerCase();

		for (char i=97; i<123; i++) {

			for (int j=0; j<input.length(); j++) {

				if (input.charAt(j)==i) {

					answer += "Numero de " + i + ": ";

					for (int k=0; k<input.length(); k++) {

						if (input.charAt(k)==i) {

							counter++;

						}

					}

					answer += counter + "\n";

					counter = 0;

					j = input.length()-1;

				}

			}

		}



		// Output result

		System.out.println(answer);

		answer = "";

	}

}