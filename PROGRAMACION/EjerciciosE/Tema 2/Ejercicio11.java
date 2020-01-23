import java.util.Scanner;

public class Ejercicio11 {

	public static void main (String args[]) {

		//Initialize variables

		Scanner keyboard = new Scanner(System.in);

		System.out.print("Introduce altura de la piramide a construir: ");

		int rows = keyboard.nextInt();

		System.out.println();




		//Building loop

		for (int i = 1; i<=rows; i++) {

			for (int j = 1; j<=(rows*2-1); j++) {

				if (j<(rows-i+1) || j>(rows+i-1)) {

					System.out.print(" ");					

				}

				else {

					System.out.print("*");

				}

			}

			System.out.println();

		}

	}

}