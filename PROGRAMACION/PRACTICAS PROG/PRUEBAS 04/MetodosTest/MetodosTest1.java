//Metodos que no devuelven valor (void)
import java.util.*;
public class MetodosTest1 {
	public static void main (String args[]){
		Scanner teclado=new Scanner(System.in);
		System.out.print("Introduce un numero: ");
		int numero=teclado.nextInt();
		cubo(numero);
		System.out.println("Se acabo");
	}
	public static void cubo(int numero){
		System.out.println("El cubo de "+numero+" es "+numero*numero*numero);
	}
}

