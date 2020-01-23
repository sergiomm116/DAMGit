public class arraysreferencia {

	public static void main (String args[]) {

		// int array1[] = {7,6,2};

		// int array2[] = {7,6,2};	// Different objects



		/* int array1[] = {7,6,2};

		int array2[] = array1;		// Hacen referencia al mismo array



		System.out.println(array1[1]); 	// Writes a 6

		System.out.println(array2[1]);	// Same value, 6



		array1[1] = 9;



		System.out.println(array1[1]);

		System.out.println(array2[1]);



		array2[2] = 4;



		System.out.println(array1[2]);

		System.out.println(array2[2]); */



		/* int array1[] = {7,6,2};

		int array2[] = {7,6,2};



		if (array1==array2) {

			System.out.println("Array1 es igual a Array2");

		}

		else {

			System.out.println("Array1 no es igual a Array2. La condición ha tomado la referencia, no los valores");

		} */



		int array1[] = {7,6,3};

		int array2[] = array1;



		if (array1==array2) {

			System.out.println("Array1 es igual a Array2. Son la misma referencia");

		}

		else {

			System.out.println("Array1 no es igual a Array2");

		}



		String cadena1 = new String("Hola");

		String cadena2 = new String("Hola");

		String cadena3 = cadena2;



		if (cadena1==cadena2) {

			System.out.println("cadena1 es igual a cadena2");

		}

		else {

			System.out.println("cadena1 no es igual a cadena2");

		}

		if (cadena3==cadena2) {

			System.out.println("Cadena 3 y 2 iguales");

		}


		

		String string1 = "Hey";

		String string2 = "Hey";



		if (string1==string2) {

			System.out.println("Yep, they are equal");

		}



		// equals compara contenidos

		if (cadena1.equals(cadena2)) {

			System.out.println("cadena1 es igual a cadena2");

		}

	}

}