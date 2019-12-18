import java.util.Scanner;
public class Metodos2 {
	
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Introduce un numero: ");
		int numero=input.nextInt();
		System.out.println("El factorial de "+numero+" es "+factorial(numero));
	}
	
	public static int factorial (int numero){
		int resultado=1;
		for(int i=2;i<=numero;i++)
			resultado*=i;
		return resultado;
	}
}

