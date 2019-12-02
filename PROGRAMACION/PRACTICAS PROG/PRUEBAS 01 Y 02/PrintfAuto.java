import java.util.Scanner;
public class PrintfAuto {
	//~ Crear una clase que pida por teclado un numero float y muestre por pantalla el numero introducido y su cuadrado ambos con dos decimales
	public static void main (String[] args) {
		Scanner input=new Scanner (System.in);
		System.out.print("Introduce un numero decimal: ");
		float n=input.nextFloat();
		System.out.printf("El cuadrado de %.2f es %.2f", n, n*n);
	}
}

