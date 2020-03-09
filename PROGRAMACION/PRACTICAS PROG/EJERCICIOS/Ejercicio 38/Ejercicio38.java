public class Ejercicio38 {

	public static void main (String args[]) {

		Persona p1 = new Persona("Dante", 43, 154);

		Persona p2 = new Persona("Lardo", 20, 145);

		Persona p3 = new Persona("Kantor", 25, 174);

		

		System.out.println(p1.compareTo(p2));

		System.out.println(p2.compareTo(p3));

		System.out.println(p3.compareTo(p1));

	}

}