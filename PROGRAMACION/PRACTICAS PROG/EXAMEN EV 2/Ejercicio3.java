public class Ejercicio3 {
		
		//Se debe llamar al metodo sumaArray pasandole un array de enteros y un entero n = 0.
		//   sumaArray(array, 0);
		
	public static int sumaArray(int[] array, int n){
		
		if (n >= array.length) {
			return 0;
		}
		
		return array[n] + sumaArray(array, n+1);
	}
}

