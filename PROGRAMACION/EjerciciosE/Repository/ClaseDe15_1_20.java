import java.util.*;

public class ClaseDe15_1_20 {

	public static void main (String args[]) {

		Datos arrayObj[] = new Datos[3];

		Scanner teclado = new Scanner(System.in);

		int suma = 0;

		for (int i=0; i<arrayObj.length; i++) {

			System.out.print("Introduce nombre: ");

			String nombre = teclado.next();

			System.out.print("Introduce salario: ");

			double salario = teclado.nextDouble();

			arrayObj[i] = new Datos(nombre, salario);

		}

		System.out.print("Sumando salario de: ");

		for (int i=0; i<arrayObj.length; i++) {

			System.out.print(arrayObj[i].nombreGet()+"...");

			suma += arrayObj[i].salarioGet();

		}

		System.out.println();

		System.out.println("La suma de salarios es: " + suma);

		System.out.println(Datos.nombreEmpresa);

		System.out.println(arrayObj[0].nombreEmpresa);

	}

}

class Datos {

	private String nombre;

	private double salario;

	static String nombreEmpresa = "Empresa SA";

	Datos(String nombre, double salario) {

		nombreSet(nombre);

		salarioSet(salario);

	}

	void nombreSet(String nombre) {

		this.nombre = nombre;

	}

	public String nombreGet() {

		return nombre;

	}

	void salarioSet(double salario) {

		this.salario = salario;

	}

	public double salarioGet() {

		return salario;

	}

}