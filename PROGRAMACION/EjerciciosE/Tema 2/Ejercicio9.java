import java.util.Scanner;

public class Ejercicio9 {

	public static void main (String args[]) {

		//Initialize and secure variables

		boolean secure = false;

		int number = 0;

		do {

			System.out.print ("Introduce un numero para convertirlo a binario: ");

			Scanner keyboard = new Scanner(System.in);

			if (keyboard.hasNextInt()) {

				number = keyboard.nextInt();

				if (number >= 0) {

					secure = true;

				}

				else {

					System.out.println("La entrada no es positiva, intentelo de nuevo");

				}

			}

			else {

				System.out.println("La entrada no es correcta, intentelo de nuevo");

			}

		} while (!secure);		



		//Division and result generating

		if (number < 2) {

			System.out.println("El numero " + number + " en binario es " + number);

		}

		else {

			int d = number;

			String result_1 = "";

			do {

				result_1 = d % 2 + result_1;

				d /= 2;

			} while (d >= 2);

			result_1 = d + result_1;

			System.out.println("El numero " + number + " en binario es " + result_1);			

		}

	}

}