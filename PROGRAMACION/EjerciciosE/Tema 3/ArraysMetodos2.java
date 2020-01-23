import java.util.Arrays;

public class ArraysMetodos2 {

	public static void main (String args[]) {

		int array1[] = new int[] {1,6,5,4,2};

		int array2[] = new int[] {1,6,5,4,2};

		System.out.println(array1==array2);

		System.out.println(Arrays.equals(array1,array2));	// This one does. The dynamic variant (array.equals(array)) does not.

	}

}