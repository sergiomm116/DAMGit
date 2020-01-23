import java.util.Scanner;

public class Ejercicio32 {

	static Password[] passwords = new Password[5];

	static boolean[] strength = new boolean[5];

	static int size = 0;



	// Main

	public static void main (String args[]) {

		// Initialize	

		Scanner keyboard = new Scanner(System.in);

		boolean exit = false;

		

		// Size menu

		do {

			System.out.println("Generacion de passwords: opciones.");

			System.out.println("1. Longitud por defecto - 8");

			System.out.println("2. Longitud personalizada");

			char menuchoice = keyboard.nextLine().charAt(0);

			switch (menuchoice) {

				case 49: {

					size = 8;

					genPas(8);

					exit = true;					

					break;

				}

				case 50: {

					System.out.print("Introduce numero caracteres de las passwords como entero: ");

					size = keyboard.nextInt();

					if (size < 1) {

						System.out.println("!-Error en la seleccion-!");

						break;

					}

					genPas(size);

					exit = true;

					break;

				}

				default: {

					System.out.println("!-Error en la seleccion-!");

				}

			}

		} while (!exit);

		System.out.println("Password generadas y fuerza. Longitud: " + size);

		System.out.println("-------------------------------");

		for (int i=0; i<5; i++) {

			System.out.println(passwords[i].passGet() + "        " + strength[i]);

		}

	}

	static public void genPas(int card) {

		if (card == 8) {

			for (int i=0; i<5; i++) {

				passwords[i] = new Password();

				strength[i] = passwords[i].esFuerte();

			}

		}

		else {

			for (int i=0; i<5; i++) {

				passwords[i] = new Password(card);

				strength[i] = passwords[i].esFuerte();

			}

		}

	}

}