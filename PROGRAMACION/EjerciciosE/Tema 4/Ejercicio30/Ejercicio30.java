import java.util.Scanner;
import java.util.Arrays;

public class Ejercicio30 {

	static Monedero[] purse = new Monedero[0];			// [FIXED] Para la primera prueba no se hace array redimensionable

	static int tracker = 0;


	public static void main (String args[]) {

		// Testing

		// Monedero monedero1 = new Monedero("Test",300);

		// System.out.println(monedero1);



		// Menu implementation

		// Initialize variables

		int menuchoice = 0;

		char mainmenu = 0;

		boolean exit = false;

		Scanner keyboard = new Scanner(System.in);

		

		// Menu							// [OFF] Insecure input on menuchoice, rte on string, and on set up methods

		do {

			System.out.println("Elige accion: ");

			System.out.println("1.- Crear nuevo monedero");

			System.out.println("2.- Pagar");

			System.out.println("3.- Ingresar");

			System.out.println("4.- Consultar");

			System.out.println("5.- Eliminar");

			System.out.println("6.- Salir");

			System.out.print("Numero opcion+ENTER: ");

			mainmenu = keyboard.nextLine().charAt(0);

			switch (mainmenu) {

				case 49: {

					// Resize array

					String nombreins;

					int saldoins;

					System.out.print("Elige el nombre del nuevo monedero: ");

					nombreins = keyboard.next();

					// Check existing name

					for (int i=0; i<tracker; i++) {

						if (purse[i].nombreGet()==nombreins) {

							System.out.println("Ya existe un monedero con este mismo nombre");

							break;

						}

					}

					System.out.print("Elige el saldo inicial del monedero: ");

					saldoins = keyboard.nextInt();

					purse = Arrays.copyOf(purse, (purse.length+1));

					purse[tracker] = new Monedero(nombreins, saldoins);

					tracker++;

					System.out.println();
		
					break;

				}

				case 50: {

					printcontent();

					System.out.print("Elige el monedero con el que pagas: ");

					menuchoice = keyboard.nextInt();

					// Check if exists

					if (menuchoice < tracker) {

						System.out.print("Elige cantidad a pagar: ");

						int pay = keyboard.nextInt();

						purse[menuchoice].substract(pay);

					}

					else {

						System.out.println("Ese monedero no existe");

					}
		
					break;

				}

				case 51: {

					printcontent();

					System.out.print("Elige el monedero en el que ingresas: ");

					menuchoice = keyboard.nextInt();

					// Check if exists

					if (menuchoice < tracker) {

						System.out.print("Elige cantidad a ingresar: ");

						int in = keyboard.nextInt();

						purse[menuchoice].adding(in);

					}

					else {

						System.out.println("Ese monedero no existe");

					}							
		
					break;

				}

				case 52: {

					printcontent();
		
					break;

				}

				case 53: {

					printcontent();

					System.out.print("Elige el monedero que eliminas: ");

					menuchoice = keyboard.nextInt();

					// Check if exists

					if (menuchoice < tracker) {

						while (menuchoice < (tracker-1)) {

							purse[menuchoice] = purse[menuchoice+1];

							menuchoice++;

						}

						purse = Arrays.copyOf(purse, (purse.length-1));

						tracker--;

					}

					else {

						System.out.println("Ese monedero no existe");

					}
		
					break;

				}

				case 54: {

					exit = true;	
		
					break;

				}

				default: {

					System.out.println("Opcion no encontrada");		
		
					break;

				}

			}

		} while (!exit);

	}



	static public void printcontent() {

		System.out.println();

		System.out.println("   ---Listado de monederos---");

		System.out.println("     Nombre\t\t Saldo    ");

		for (int i=0; i<tracker; i++) {

			System.out.println("[" + i + "]" + purse[i]);

		}

		System.out.println();

	}

}