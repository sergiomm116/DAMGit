public class ClaseDe16_12_19 {

	int var1;					// Solo puede haber declaraciones fuera de métodos

	public static void main (String[] args) {

		Prueba2 obj1 = new Prueba2();		// Creación de objeto

		Prueba2 obj2 = new Prueba2();

		// obj1 = obj2;				// Esto haría de obj1 un alias de obj2

		if (obj1==obj2)				// Esto es false, son dos objetos diferentes

	}

	// Declaración de método

	public void nombreMetodo(int a, long l) {

		System.out.println(a);

	}

}