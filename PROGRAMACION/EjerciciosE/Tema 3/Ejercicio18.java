import java.util.Scanner;

public class Ejercicio18 {

	public static void main (String args[]) {

		// Initialize

		int[] sorting = new int[5];

		Scanner keybaord = new Scanner(System.in);

		boolean changed = true;

		int saved;



		// Input to sorting

		for (int i=0; i<5; i++) {

			System.out.print("Introduce el numero [" + i + "]: ");

			sorting[i] = keybaord.nextInt();

			System.out.println();

		}



		// Sorting input

		while (changed) {

			changed = false;

			for (int i=0; i<4; i++) {

				if (sorting[i+1] < sorting[i]) {

					saved = sorting[i+1];
					
					sorting[i+1] = sorting[i];

					sorting[i] = saved;

					changed = true;

				}

			}

		}



		// Output

		System.out.println("Array reordenado de menor a mayor: ");

		for (int i=0; i<5; i++) {

			System.out.print(sorting[i] + ", ");

		}

		System.out.println("\b\b  ");

	}

}