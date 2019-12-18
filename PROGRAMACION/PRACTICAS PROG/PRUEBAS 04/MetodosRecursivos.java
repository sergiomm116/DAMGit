public class MetodosRecursivos {
	static int i=1;
	public static void main (String[] args) {
		recursivo(i);
		System.out.println("Se acabo con la i="+i);
	}
	static void recursivo (int i){
		if(!(i==5)){
			System.out.println("Recursivo: "+i);
			recursivo(++i);								//Se llama asi mismo de nuevo y vuelve al if. Con una unidad más.
			System.out.println("Acaba "+i);
		}
	}
}

