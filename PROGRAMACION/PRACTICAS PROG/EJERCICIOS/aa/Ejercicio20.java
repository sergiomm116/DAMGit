import java.util.Scanner;
public class Ejercicio20 {
	
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] array = new int[n];
		
		for (int i = 0; i < n;i++) {
			array[i] = (int)(Math.random()*300);
		}
		
		for (int i:array) {
			System.out.printf("%03d, ",i);
		}
		System.out.println("\b\b ");
		
		System.out.print("Introduce un valor para buscar (1-300): ");

		int j = input.nextInt();

		System.out.println("Se ha encontrado el valor solicitado en las siguientes posiciones:");

		boolean found = false;

		for (int i=0; i<n; i++) {

			if (array[i]==j) {

				System.out.printf("%d, ",i);

				found = true;

			}

		}

		System.out.print("\b\b ");

		if (!found) System.out.println("Ninguna");

	}
		

	
}

