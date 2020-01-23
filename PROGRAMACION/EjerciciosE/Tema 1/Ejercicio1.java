public class Ejercicio1 {

	public static void main (String args[]) {

		int save;

		int value_1 = 3;

		int value_2 = 7;

		System.out.println("Initial values: " + value_1 + " and " + value_2);

		save = value_1;

		value_1 = value_2;

		value_2 = save;

		System.out.println("Final values: " + value_1 + " and " + value_2);

	}

}