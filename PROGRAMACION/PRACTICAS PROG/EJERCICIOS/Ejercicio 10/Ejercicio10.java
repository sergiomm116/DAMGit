import java.util.Scanner;
public class Ejercicio10{
	
	public static void main (String[] args) {
		
		//~ Scanner y variables
		Scanner input=new Scanner(System.in);
		System.out.print("Introduce el ancho del rectangulo: ");
		int ancho=input.nextInt();
		System.out.print("Introduce el alto del rectangulo: ");
		int alto=input.nextInt();
		System.out.println(" ");
		//~ Imprime los *
		for(int filas=1;filas<=alto;filas++){
			System.out.print("* ");
				for(int columnas=2;columnas<=ancho;columnas++){
						System.out.print("* ");
				}
		System.out.println();
		}
			
	}
}


