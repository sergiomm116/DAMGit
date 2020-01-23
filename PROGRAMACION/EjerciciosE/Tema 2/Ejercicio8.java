import java.util.Scanner;

public class Ejercicio8 {

	public static void main (String args[]) {

		//Inicializando variables, escáner. Mensaje de inicio de juego.

		int attempts = 1;

		int number = (int) ((Math.random()*20)+1);

		int save = -1;

		boolean guessed = false;

		Scanner input = new Scanner(System.in);

		System.out.println("Intenta adivinar el numero generado");



		//Bucle de intentos y feedback

		while (!guessed) {

			System.out.println("Introduce un numero");

			save = input.nextInt();

			if (save==number) {
				
				System.out.println("Correcto en " + attempts + " intentos");

				guessed = true;

			}

			else {

				if (save<number) {

					System.out.println("El numero es mayor...");

				}

				else {

					System.out.println("El numero es menor...");

				}

				attempts++;

			}

		}

	}

}