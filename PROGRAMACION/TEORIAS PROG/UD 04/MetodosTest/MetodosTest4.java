//Metodos recursivos
public class MetodosTest4 {
	static int i=1;
	public static void main (String args[]){
		recursivo(i);
		System.out.println("Se acabo con la i = "+i);
	}
	static void recursivo(int i){
		if (!(i==3)){
			System.out.println("Recursivo: "+i);
			recursivo(++i);
			System.out.println("Acaba "+i);
		}
	}
}

