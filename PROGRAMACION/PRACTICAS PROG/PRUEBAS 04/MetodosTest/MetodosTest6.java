//Metodos que devuelven tipos objeto
public class MetodosTest6 {
	public static void main (String args[]){
		String s1=new String("Hola");
		int a1[]=new int[]{7,2,1,4};
		System.out.printf("La cadena %s ahora es %s\n",s1,cadena(s1));
		for (int valor:array(a1))
			System.out.print(valor+" ");
		System.out.println("\nEl array ha sido modificado");
	}
	static String cadena(String s2){
			return s2.replace('o','*');
	}
	static int[] array(int a2[]){
		a2[2]=9;
		return a2;
	}
}
