import javax.swing.JOptionPane;

public class Ejercicio7 {

	public static void main (String args[]) {

		//Inicialización y toma de valores

		int year = Integer.parseInt(JOptionPane.showInputDialog("Introduce a\u00a4o:"));

		int month = Integer.parseInt(JOptionPane.showInputDialog("Introduce mes (1 - 12):"));



		//Condicionales y salida de datos

		if (month <= 7 && month > 0) {

			if (month==2) {

				if (year%4==0 && (year%100!=0 || year%400==0)) {

					System.out.println("El mes tiene 29 dias");

				}

				else {

					System.out.println("El mes tiene 28 dias");

				}

			}

			else {

				if (month%2==0) {

					System.out.println("El mes tiene 30 dias");

				}

				else {
			
					System.out.println("El mes tiene 31 dias");

				}

			}

		}

		else if (month > 7 && month < 13){							// Sin importar el año, esto es siempre verdad

			if (month%2==0) {

				System.out.println("El mes tiene 31 dias");

			}

			else {

				System.out.println("El mes tiene 30 dias");

			}

		}

		else {

			System.out.println("El mes introducido no existe. Fuera de rango (1,12)");

		}

	}

}