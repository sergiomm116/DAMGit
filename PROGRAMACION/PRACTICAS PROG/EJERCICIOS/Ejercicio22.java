public class Ejercicio22 {
	
	public static void main (String[] args) {
		int[] columna = {0,1,2,3};
		int[] fila = {0,1,2,3};
		int celda=0;
		
		//~ System.out.println(" "+" "+" "+"1 "+"2 "+"3 "+"4");
		System.out.println("-----------------");
		for(int i=0;i<=3;i++){
			//~ System.out.print((i+1)+" "+" ");
			for(int j=0;j<=3;j++){
				celda= fila[i]+columna[j];
				System.out.print("| "+celda+" ");
			}
			System.out.print("|");
			System.out.println("\n-----------------");
		}
	}
}

