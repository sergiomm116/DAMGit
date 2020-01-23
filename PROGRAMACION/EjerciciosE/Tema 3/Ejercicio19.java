public class Ejercicio19 {

	public static void main (String args[]) {

		// Generate a single random number between 1 and 49

		// ((int) (Math.random()*49)) + 1



		// Initialize

		int[] array = new int[50];

		int number = 0;



		// Generate randoms already sorted

		for (int i=0 ; i<6; i++) {

			number = ((int) (Math.random()*49)) + 1;

			if (array[number] == 0) {

				array[number] = 1;

			}

			else {

				i--;

			}

		}	



		// Print sorted array

		System.out.print("El array generado es: ");

		for (int i=0 ; i<50; i++) {

			if (array[i]==1) {
		
				System.out.print(i + ", ");

			}

		}

		System.out.print("\b\b  ");

	}

}