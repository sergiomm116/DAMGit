import java.util.Scanner;
import java.util.Arrays;

public class Ejercicio23 {

	public static void main (String args[]) {

		// Initialize

		Scanner keyboard = new Scanner(System.in);

		int array[][] = new int[1][4];

		int invoice = 0;

		int terminate = 0;

		int counter = 0;

		int litresold = 0;

		

		// Loop requests

		do {

			System.out.println("Nueva factura [Continuar: Cualquier numero ; Cancelar: 0]: ");

			terminate = keyboard.nextInt();

			if (terminate != 0) {

				invoice++;

				array = Arrays.copyOf(array,invoice);

				array[invoice-1] = new int[4];



				// Input data

				System.out.println("Introducir codigo producto (numerico): ");
	
				array[invoice-1][0] = keyboard.nextInt();

				System.out.println("Introducir Litros: ");
	
				array[invoice-1][1] = keyboard.nextInt();

				litresold += array[invoice-1][1];

				System.out.println("Introducir precio/L (euros): ");
	
				array[invoice-1][2] = keyboard.nextInt();

				array[invoice-1][3] = array[invoice-1][1]*array[invoice-1][2];

				if (array[invoice-1][3] > 600) counter++;

			}

		} while (terminate!=0);



		// Print result

		System.out.println("CODPRODUCTO\t Litros\t precio/L\t Total");

		System.out.println("------------------------------------------------------");

		for (int row=0; row<array.length; row++) {

			System.out.print(array[row][0] + "\t\t ");

			System.out.print(array[row][1] + "\t " );

			System.out.print(array[row][2] + "\t\t ");

			System.out.print(array[row][3] + "\t");

			System.out.println();

		}

		System.out.println("------------------------------------------------------");

		System.out.println("Litros vendidos: " + litresold);

		System.out.println("Facturas sobre 600 euros: " + counter);

	}

}