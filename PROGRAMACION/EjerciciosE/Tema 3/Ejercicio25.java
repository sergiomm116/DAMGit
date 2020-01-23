public class Ejercicio25 {

	public static void main (String args[]) {

		// Initialize

		System.out.println();

		int points[] = new int[5];				// Contains total score from teams A-E

		int control = 0;					// Holds current index on points

		int opocontrol = 0;					// Holds the opposing team's index to cancel result generation

		int locals = 0;						// Holds local's score

		int visits = 0;						// Holds visitor's score

		int rotatep = 0;					// Holds rotating score for final board

		

		// Print result + layout

		// Top rows

		for (int i=0; i<27; i++) System.out.print("-");

		System.out.println();

		System.out.print("|L VIS");

		for (int i=0; i<21; i++) {

			if (i%4==0) {
				
				System.out.print("|");

			}

			else {

				System.out.print(" ");

			}

		}

		System.out.println();

		System.out.print("|O    ");

		for (int i=0; i<21; i++) {

			if (i%4==0) {
				
				System.out.print("|");

			}

			else if (i%2==0) {

				System.out.print((char) (control+65));

				control++;

			}

			else {

				System.out.print(" ");

			}

		}

		System.out.println();

		control = 0;						// Clean the control value

		System.out.print("|C    ");

		for (int i=0; i<21; i++) {

			if (i%4==0) {
				
				System.out.print("|");

			}

			else {

				System.out.print(" ");

			}

		}

		System.out.println();

		for (int i=0; i<27; i++) System.out.print("-");

		System.out.println();

		// Local rows, out of the columns

		for (int i=0; i<5; i++) {

			System.out.print("|     ");

			for (int j=0; j<21; j++) {

				if (j%4==0) {
				
					System.out.print("|");

				}

				else {

					System.out.print(" ");

				}

			}

			System.out.println();

			System.out.print("|  ");

			System.out.print((char) (control+65));

			System.out.print("  ");

			for (int j=0; j<11; j++) {

				if (j%2==0) {
				
					System.out.print("|");

				}

				else {

					if (control==opocontrol) {

						System.out.print("***");

						opocontrol++;

					}

					else {

						locals = (int) (Math.random()*6);

						visits = (int) (Math.random()*6);

						if (locals > visits) {

							points[control] += 3;

						}

						if (visits > locals) {

							points[opocontrol] += 3;

						}

						if (visits==locals) {

							points[control]++;

							points[opocontrol]++;

						}

						System.out.print(locals + "-" + visits);

						opocontrol++;

					}

				}

			}

			opocontrol = 0;						// Reset visitors index control

			System.out.println();

			System.out.print("|     ");

			for (int j=0; j<21; j++) {

				if (j%4==0) {
				
					System.out.print("|");

				}

				else {

					System.out.print(" ");

				}

			}

			System.out.println();

			for (int j=0; j<27; j++) System.out.print("-");

			System.out.println();

			control++;			

		}

		control = 0;							// From now on, control holds the point index to nulify it



		// Total points and print clasification

		System.out.println();

		System.out.println();

		System.out.println("---CLASIFICACION---");

		for (int i=0; i<5; i++) {

			for (int j=0; j<5; j++) {
				
				if (rotatep<points[j]) {

					rotatep = points[j];

					control = j;

				}

			}

			System.out.print("Puesto numero " + (i+1) + ": ");

			System.out.print("Equipo " + (char) (control+65));

			System.out.print(" con " + rotatep + "pts");

			rotatep = 0;

			points[control] = 0;

			System.out.println();

		}

	}

}