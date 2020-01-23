public class ArraysMultidimensionales {

	public static void main (String args[]) {

		// Crear array irregular

		int array[][] = new int[3][];

		array[0] = new int[5];

		array[1] = new int[3];

		array[2] = new int[2];



		// Aquí estaríamos redimensionando. De normal, no tendríamos las tres últimas filas

		int array2[][] = new int[3][4];

		array2[0] = new int[5];

		array2[1] = new int[3];

		array2[2] = new int[2];



		// Arrays tridimensionales

		int array3[][][] = new int[3][4][5];



		// Rellenando arrays y recorriendo con foreach

		int array1[][] = new int[3][5];

		for (int fila=0; fila<=2; fila++) {

			for (int columna=0; columna<=4; columna++) {

				array1[fila][columna] = (int) ((Math.random()*9)+1);

			}

		}

		for (int array11[] : array1) {

			for (int valor : array11) {

				System.out.print(valor + " ");

			}

			System.out.println();

		}

	}

}