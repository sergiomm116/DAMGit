import java.util.Scanner;
public class Ejercicio12 {
	
	//~ Scanner para pedir por teclado la base de la piramide.
	
	public static void main (String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Introduce la base de la piramide: ");
		int base=input.nextInt();
		int espacio;
		int fila;
		int asterisco;
		System.out.println(" ");
		
		//~ El programa escribe tantos espacios como indique la base menos el numero de fila y escribe tantos asteriscos como el numero de fila.
		//~ Ejemplo (Base 5):
		//~ Fila 1: 4 espacios 1 asterisco.
		//~ Fila 2: 3 espacios 2 asteriscos...
		//~ Fila 5: 0 espacios 5 asteriscos.
		//~ Esto se repite hasta que en una fila se han escrito tantos asteriscos como la base de la pimamide.
		
		for(fila = 0 ; fila<base ; fila++) {
			for(espacio=0 ; espacio<base-fila ;espacio++){
				System.out.print(" ");
			}
			for(asterisco=0 ; asterisco<=fila ; asterisco++) {
			System.out.print("* ");
			}
			System.out.println(" ");
			System.out.println(fila);
		if (fila<=base) {
			for(fila=base-1;fila<0;fila++){
					for(espacio=1 ; espacio<=base-fila ;espacio++){
					System.out.print(" a");
					}
					for(asterisco=base ; asterisco<fila ; asterisco--) {
					System.out.print("* ");
					}
				}
			}
		}
	}
}
