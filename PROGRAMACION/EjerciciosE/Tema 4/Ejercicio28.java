public class Ejercicio28 {

	public static void main (String args[]) {

		int a = 5;

		int b = 9;

		double c = 7.5;

		double d = 12.12;

		System.out.println(suma(a,b));

		System.out.println(suma(c,d));

		System.out.println(suma(a,c));

		System.out.println(suma(d,b));

	}


	
	// Suma métodos

	public static int suma (int a, int b) {

		// System.out.println("En suma int int");

		return (a+b);

	}

	public static double suma (double a, double b) {

		// System.out.println("En suma dbl dbl");

		return (a+b);

	}

	public static double suma (int a, double b) {

		// System.out.println("En suma int dbl");

		double c = (double) a;				// New variable to avoid lossy conversion

		return (c+b);

	}

	public static double suma (double a, int b) {

		// System.out.println("En suma dbl int");

		double c = (double) b;

		return (c+b);

	}

}