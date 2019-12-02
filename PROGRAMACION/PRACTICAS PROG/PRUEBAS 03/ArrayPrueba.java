//~ UNA CLASE QUE LEA 5 NUMEROS POR TECLADO Y LOS MUESTRE EN ORDEN INVERSO A COMO SE HAN INTRODUCIDO
import java.util.Scanner;
public class ArrayPrueba {
	
	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		int numeros[]=new int [5];
		for (int indice=0;indice<=4;indice++){
			System.out.print("Introduce un 5 numeros (llevas "+indice+"): ");
			numeros[indice]=input.nextInt();
		}
		for (int indice=4;indice>=0;indice--){
			System.out.print(numeros[indice]+", ");
		}
		System.out.println("\b\b"+".");
	}
}

