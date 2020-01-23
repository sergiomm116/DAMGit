public class derkechendo {

	public static void main (String args[]) {

		for (int i = 100; i > 1; i--) {

			System.out.print(i + ", ");

		}

		System.out.println(1);



		//Filas y columnas

		for (int filas = 1; filas<=3; filas++) {

			System.out.print("Filas: " + filas + " - ");

			for (int columnas = 1; columnas<=6; columnas++) {

				System.out.print(columnas+" ");

			}

			System.out.println();

		}		

	}

}