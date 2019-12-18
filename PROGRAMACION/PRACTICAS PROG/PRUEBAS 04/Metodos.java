import java.util.Scanner;
public class Metodos {
	
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Introduce un numero: ");
		int numero=input.nextInt();
		cubo(numero);										//Ejecuta el metodo cubo independientemente de donde se encuentre.
		System.out.println("Se acabo");
	}
		
	public static void cubo (int numero){
		System.out.println("El cubo de "+numero+" es "+numero*numero*numero);
	}
}

