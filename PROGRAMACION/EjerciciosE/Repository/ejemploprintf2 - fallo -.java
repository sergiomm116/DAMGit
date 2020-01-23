import java.util.Scanner;

public class ejemploprintf2 {

	public static void main (String args[]) {

		Scanner keyboard = new Scanner(System.in);

		System.out.print("Introduce tu nombre: ");

		String name = keyboard.nextLine();

		System.out.print("Introduce tu altura en cm: ");

		Double height = (Double.parseDouble(keyboard.nextInt())) / 100;


		System.out.printf("Mi nombre es %C y mido %.2f(m)", name, height);

	}

}