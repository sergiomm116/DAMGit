import java.util.Scanner;

public class Ejercicio13 {

	public static void main (String args[]) {

		// Initicializar variables y tomar valor válido

		boolean secure = false;

		int number = -1;

		do {

			Scanner keyboard = new Scanner(System.in);

			System.out.print("Introduce numero que se escribira con letra, entre 0 y 99: ");

			if (keyboard.hasNextInt()) {

				number = keyboard.nextInt();

				if (number < 0 || number > 99) {

					System.out.println("Numero fuera de rango. Introducir un numero entre 0 y 99");

				}

				else {

					secure = true;

				}

			}

			else {

				System.out.println("Error al introducir un numero, solo se admiten enteros entre 0 y 99");

			}

		} while (!secure);



		// Escribir número, 20 y decenas de "numeros compuestos"

		System.out.print("El numero introducido, con letras, se escribe: ");

		if (number > 29) {

			int dec = number/10;

			switch (dec) {

				case 3: System.out.print("treinta y "); break;

				case 4: System.out.print("cuarenta y "); break;

				case 5: System.out.print("cincuenta y "); break;

				case 6: System.out.print("sesenta y "); break;

				case 7: System.out.print("setenta y "); break;

				case 8: System.out.print("ochenta y "); break;

				case 9: System.out.print("noventa y "); break;

			}

		}

		if (number < 30 && number > 19) {

			if (number == 20) System.out.print("veinte");

			else System.out.print("veinti");

		}

		if (number < 20 && number > 15) {

			System.out.print("dieci");

		}


		
		// Escribir número, unidades y "numeros simples"

		switch (number) {

			case 15: System.out.print("quince"); number = -1; break;

			case 14: System.out.print("catorce"); number = -1; break;

			case 13: System.out.print("trece"); number = -1; break;

			case 12: System.out.print("doce"); number = -1; break;

			case 11: System.out.print("once"); number = -1; break;

			case 10: System.out.print("diez"); number = -1; break;

			case 0: System.out.print("cero"); number = -1; break;

		}

		while (number > 10) {

			number -= 10;

		}

		switch (number) {

			case 9: System.out.print("nueve"); break;

			case 8: System.out.print("ocho"); break;

			case 7: System.out.print("siete"); break;

			case 6: System.out.print("seis"); break;

			case 5: System.out.print("cinco"); break;

			case 4: System.out.print("cuatro"); break;

			case 3: System.out.print("tres"); break;

			case 2: System.out.print("dos"); break;

			case 1: System.out.print("uno"); break;

		}

	}

}