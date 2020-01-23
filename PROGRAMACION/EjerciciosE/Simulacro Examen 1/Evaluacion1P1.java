import java.util.Scanner;

public class Evaluacion1P1 {

	public static void main (String args[]) {

		Scanner keyboard = new Scanner(System.in);

		System.out.print("Introduce un numero entero: ");

		int number = keyboard.nextInt();

		System.out.println();

		int save = number;

		int digitc = 1;



		while (save >= 10) {

			save /= 10;

			digitc++;

		}



		System.out.println("El numero " + number + " contiene " + digitc + " cifras");

	}

}