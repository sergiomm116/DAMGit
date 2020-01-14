import java.util.Scanner;

public class Ejercicio27 {

	static int suplimit;

	public static void main (String args[]) {
		
		
		Scanner keyboard =  new Scanner(System.in);

		System.out.print("Introduce limite inferior [entero]: ");

		int linf = keyboard.nextInt();

		System.out.print("Introduce limite superior [entero]: ");

		suplimit = keyboard.nextInt();
		
		int resultado=0;
		
		for (int inferior=linf;inferior<=suplimit;inferior++){
			resultado+=inferior;
		}


		// Apply method and print result

		System.out.println("La suma entre " + linf + " y " + suplimit + " es: " + resultado);

	}

	static int suma (int a) {

		if (a==suplimit) {

			return a;

		}

		else {

			return a + suma(++a);

		}

	}

}
