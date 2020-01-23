import java.util.Scanner;

public class Ejercicio12 {

	public static void main (String args[]) {

		//Initialize variables

		Scanner keyboard = new Scanner(System.in);

		System.out.print("Introduce la diagonal del rombo (diagonales pares se incrementan en 1): ");

		int rows = (keyboard.nextInt())/2+1;

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

		for (int i = (rows-1); i>=1; i--) {

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