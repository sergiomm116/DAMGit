public class Ejercicio2 {

	public static void main (String args[]) {

		double radius = 2;				// (m)

		final double pi = 3.141592;				// Constant

		radius *= 100;					// (m) -> (cm)

		
		// Output Perimeter

		double P = 2 * radius * pi;

		System.out.println("El perimetro de la circunferencia de radio " + radius + "(cm)" + " es " + P + "(cm)");


		// Output Area

		double A = pi * radius * radius;

		System.out.println("El area del circulo de radio " + radius + "(cm)" + " es " + A + "(cm\u00b2)" );
	
			

	}

}