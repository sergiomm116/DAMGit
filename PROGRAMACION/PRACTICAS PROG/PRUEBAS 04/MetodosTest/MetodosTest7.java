//Los parametros de tipo objeto de los Metodos se pasan por referencia
public class MetodosTest7 {
	public static void main (String args[]){
		int a1[]=new int[]{7,2,1,4};
		System.out.print("El array: ");
		for (int valor:a1)
			System.out.print(valor+" ");
		System.out.println();
		array(a1);
		System.out.print("Ha sido modificado: ");
		for (int valor:a1)
			System.out.print(valor+" ");
		System.out.println();
	}
	static void array(int a2[]){
		a2[2]=9;
	}
}
