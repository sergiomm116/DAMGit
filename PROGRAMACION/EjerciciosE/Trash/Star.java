import java.util.Scanner;

public class Star {

	public static void main (String args[]) {

		Scanner keyboard = new Scanner(System.in);

		System.out.print("Input star size: ");

		int size = keyboard.nextInt();

		for (int i = 1; i <= (size*3+1); i++) {

			if (i <= size) {

				for (int j = 1; j < (size*2+3-i)); j++) {

					System.out.println(" ");

				}

				for (int j = 1; j >= (size*2+3-i)) {

					System.out.println("*");
	
				}

			}

			if (i <= )

		}

	}

}