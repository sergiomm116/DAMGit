import java.util.Scanner;
public class Ejercicio11 {
	
	//~ Scanner para pedir por teclado la base de la piramide.
	
	public static void main (String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Introduce la base de la piramide: ");
		int base=input.nextInt();
		System.out.println(" ");
		
		//~ El programa escribe tantos espacios como indique la base menos el numero de fila y escribe tantos asteriscos como el numero de fila.
		//~ Ejemplo (Base 5):
		//~ Fila 1: 4 espacios 1 asterisco.
		//~ Fila 2: 3 espacios 2 asteriscos...
		//~ Fila 5: 0 espacios 5 asteriscos.
		//~ Esto se repite hasta que en una fila se han escrito tantos asteriscos como la base de la pimamide.
		
		for(int fila = 0 ; fila<base ; fila++) {
			for(int espacio=0 ; espacio<base-fila ;espacio++){
				System.out.print(" ");
			}
			for(int asterisco=0 ; asterisco<=fila ; asterisco++) {
			System.out.print("* ");
			}
			System.out.println(" ");
		}
	}
}
