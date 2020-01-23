import java.util.Scanner;

public class ejemploprintf {

	public static void main (String args[]) {

		Scanner keyboard = new Scanner(System.in);

		System.out.print("Introduce un float, se calcula su cuadrado: ");

		float number = keyboard.nextFloat();

		System.out.println();



		System.out.printf("El cuadrado de %.2f es %.2f", number, (number*number));

	}

}