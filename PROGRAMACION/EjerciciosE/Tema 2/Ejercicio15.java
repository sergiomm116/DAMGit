public class Ejercicio15 {

	public static void main (String args[]) {

		long dumper = 0;

		for (int i = 0; i < 1000; i++) {

			System.out.printf("%03d", i);

			// Dumper

			for (int j = 0; j < 99999999; j++) {

				for (int z = 0; z < 99999999; z++) {

					dumper += z;

				}

				dumper = 0;

			}

			// Clean last value

			System.out.print("\b\b\b");

		}

	}

}
