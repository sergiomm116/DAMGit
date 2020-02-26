public class ex3 {
		
	public static int sumaArray(int[] array, int n){
		if (n >= array.length) {
			return 0;
		}
		
		return array[n] + sumaArray(array, n+1);
	}

		
	public static void main (String[] args) {
		
		int[] n = {1,2,1};
		
		System.out.println(sumaArray(n, 0));
		
	}
}

