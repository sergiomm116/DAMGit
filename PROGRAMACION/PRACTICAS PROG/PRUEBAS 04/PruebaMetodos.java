


public class PruebaMetodos {
	
	public static void main (String[] args) {
		int array1[]=new int []{1,7,2};
		
		metodo1(array1);
		
		for (int valor:array1){
			System.out.print(valor+" ");
		}
	}
	public static void metodo1(int array2[]){
		array2[1]=0;
	}
}

