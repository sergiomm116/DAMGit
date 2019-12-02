
public class ArrayMulti1 {
	
	public static void main (String[] args) {
		int array1[][]=new int [3][5];
		for (int fila=0;fila<=2;fila++){
			for (int columna=0;columna<=4;columna++){
			array1[fila][columna]=(int)(Math.random()*10);
			}
		}
		
			for(int array2[] : array1){
				for(int x : array2){
				System.out.print(x+" ");
				}
			System.out.println();	
			}
			
			for (int i=0;i<=3;i++){
			System.out.println();
			}
			
			for (int fila=0;fila<=2;fila++){
				for (int columna=0;columna<=4;columna++){
					System.out.print(array1[fila][columna]);
				}
			System.out.println();
			}
			
	}
}

