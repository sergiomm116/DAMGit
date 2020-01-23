import java.util.Scanner;

public class S81019 {

	public static void main (String args[]) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce un numero entre 1 y 9: ");

		int number = teclado.nextInt();

		int control = 1;

		do {

			System.out.println(number + " x " + control + " = " + (number*control));

			control++;

		} while (control<=10);			//You can initialize variables within the loop. Mandatory  brackets

	}

}