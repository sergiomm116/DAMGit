import java.util.Arrays;

public class ClaseArrays {

	public static void main (String args[]) {

		int array[] = new int[5];

		Arrays.fill(array,7);		// Fill array with 7s

		for (int valor : array) {

			System.out.print(valor + " ");

		}



		// binarySearch error

		int array2[] = new int[] {3,7,1,8,9};
	
		Arrays.sort(array2);				// Without sorting, the results are unexpected

		System.out.println(Arrays.binarySearch(array2,7));



		// Run time resizing

		int array3[] = new int[] {3,7,1,8,9};

		System.out.println(array3);

		array3 = Arrays.copyOf(array3,10);

		System.out.println(array3);

		System.gc();					// Throw gc to clean lost references

		for (int value : array3) {

			System.out.print(value + " ");

		}

	}

}