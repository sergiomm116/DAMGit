public class ArraysDeclaracion {
	public static void main (String args[]) {
		//Opcion 1, todos los elementos se inicializan a 0
		int notas1[];//Tambien int[] notas;
		notas1=new int[3];//Array unidimensional para 3 enteros
		//Similar a int notas1[]=new int[3];
		
		//Opcion 2, los elementos se inicializan con valores concretos
		int notas2[];
		notas2=new int[]{1,2,3};
		//Similares a:
		//int notas2[]=new int[]{1,2,3};
		//int notas[]={1,2,3};
		
		//Muestra el valor del tercer elemento de cada Array
		System.out.printf("Para notas1->%d y para notas2->%d",notas1[2],notas2[2]);
	}
}

