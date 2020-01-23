import java.util.Scanner;

public class Ejercicio2 {

	public static void main (String args[]) {

		Scanner keyboard = new Scanner(System.in);

		System.out.print("Introduce el numero de asteriscos: ");

		int size = keyboard.nextInt();

		System.out.println();



		// Rows calculation

		int currentrow = 1;

		int remain = size - 1;

		int rowsnumber = 1;

		while (remain > currentrow) {

			if ((remain - (currentrow + 2)) > 0) {

				remain -= (currentrow + 2);

				rowsnumber++;

			}

			currentrow += 2;

		}

		System.out.println("Numero de asteriscos introducidos: " + size);

		System.out.println("Numero de filas: " + rowsnumber);

		System.out.println("Asteriscos sobrantes: " + remain);			

	}

}