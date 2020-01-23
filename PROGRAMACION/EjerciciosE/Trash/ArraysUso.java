public class ArraysUso {
	public static void main (String args[]) {

		//Comparacion de Arrays
		int notas1[]=new int[]{1,2,3};
		int notas2[]=new int[]{1,2,3};
		//notas1 y notas2 son dos objetos distintos
		System.out.println(notas1==notas2);//false
		//sus elementos si son iguales
		System.out.println(notas1[2]==notas2[2]);//true
		
		//Ahora creamos un alias de notas2, notas1 y notas2 "apuntan" al mismo array
		notas1=notas2;
		System.out.println(notas1==notas2);//true
		notas1[1]=8;
		//Cualquier modificacion sobre una referencia (variable) afecta a la otra
		System.out.println(notas2[1]);//8

	}
}

