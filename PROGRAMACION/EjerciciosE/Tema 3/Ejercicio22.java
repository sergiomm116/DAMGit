public class Ejercicio22 {

	public static void main (String args[]) {

		// Initialize variables

		int matrix[][] = new int[4][4];

		int counter = 1;



		// Fill the matrix

		for (int rows=0; rows<4; rows++) {

			for (int columns=0; columns<4; columns++) {

				matrix[rows][columns] = rows + columns;

			}

		}



		// Output the matrix

		int row = 0;

		int column = 0;

		for (; counter<=9; counter++) {

			if (counter%2==0) {

				for (int i=1; i<=9; i++) {

					if (i%2==0) {

						System.out.print(matrix[row][column]);

						column++;

					}

					else {

						System.out.print(" | ");

					}

				}

				row++;

			}

			else {

				System.out.print(" ");

				for (int i=0; i<9; i++) {

					System.out.print("--");

				}

				System.out.print("\b ");

			}

			column = 0;

			System.out.println();

		}

	}

}