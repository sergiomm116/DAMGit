import java.util.Scanner;

public class arrayinverso {

	public static void main (String args[]) {

		int[] store = new int[5];

		Scanner keyboard = new Scanner(System.in);

		
		for (int i=0; i<5; i++) {

			System.out.println("Introduce el numero en store[" + i + "]");

			store[i] = keyboard.nextInt();

		}

		System.out.println("Su array invertido: ");

		for (int i=4; i>=0; i--) {

			if (i > 0) System.out.print(store[i] + ", ");

			else System.out.print(store[i]);

		}

	}

}