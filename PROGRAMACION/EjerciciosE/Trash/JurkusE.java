public class JurkusE {

	public static void main (String args[]) {

		String cadena = "";			// Inicializar cadena

		
		for (int i=0; i<=9; i++) {		// Formar cadena

			cadena += i + "  ";

			for (int j=0; j<=9; j++) {

				cadena += i;

				cadena += j + " ";

			}

			cadena += "\n";

		}

		
		System.out.print(cadena);		// Mostrar cadena por pantalla

	}

}