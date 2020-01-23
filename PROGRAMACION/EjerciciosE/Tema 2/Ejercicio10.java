import java.util.Scanner;

public class Ejercicio10 {

	public static void main (String args[]) {

		//Input - !Lacks secure input

		boolean secure = false;

		int checking = -1;

		int columnas = -1;

		int filas = -1;



		do {

			Scanner keyboard = new Scanner(System.in);

			System.out.print("Introduce un ancho para construir el rectangulo: ");

			if (keyboard.hasNextInt()) {

				checking = keyboard.nextInt();

				if (checking <= 0) {

					System.out.println("La dimension introducida no es posible");

				}

				else {
					
					columnas = checking;

					secure = true;

				}

			}

			else {

				System.out.println("Solo se aceptan numeros enteros como dimensiones. Intentar de nuevo.");

			}

		} while (!secure);

		secure = false;



		do {

			Scanner keyboard = new Scanner(System.in);

			System.out.print("Introduce un alto para construir el rectangulo: ");

			if (keyboard.hasNextInt()) {

				checking = keyboard.nextInt();

				if (checking <= 0) {

					System.out.println("La dimension introducida no es posible");

				}

				else {
					
					filas = checking;

					secure = true;

				}

			}

			else {

				System.out.println("Solo se aceptan numeros enteros como dimensiones. Intentar de nuevo.");

			}

		} while (!secure);



		//Solution loop

		for (int i = 1; i<=filas; i++) {

			for (int j = 1; j<=columnas; j++) {

				System.out.print("*");

			}

			System.out.println();

		}

	}

}