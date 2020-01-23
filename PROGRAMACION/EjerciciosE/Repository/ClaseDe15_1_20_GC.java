public class ClaseDe15_1_20_GC {

	// Clase de test de finalize

	public static void main (String args[]) {

		ClaseDos obj1 = new ClaseDos();

	}

}

class ClaseDos {

	ClaseDos obj1;

	public ClaseDos() {

		System.out.println("Aquí empieza todo");

		System.gc();

		System.out.println("Limpieza terminada");

	}

	protected void finalize() {

		obj1 = null;

	}

}