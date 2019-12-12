//~ crear una clase que nos indique los caracteres y el numero de veces que aparece cada uno en un texto introducido 
//~ por teclado y no distinguiremos entre mayusculas y minusculas
import java.util.Scanner;

public class Ejercicio24 {
	
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Introduce el texto: ");
		String texto = input.nextLine();
		texto = texto.toLowerCase();

		for (int i=0;i<=texto.length();i++) {
			String caracter = texto.substring(i,i);
			System.out.print(caracter);
		}
		
	}
}

