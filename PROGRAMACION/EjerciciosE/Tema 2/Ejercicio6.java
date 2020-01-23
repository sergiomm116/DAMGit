import javax.swing.JOptionPane;

public class Ejercicio6 {

	public static void main (String args[]) {

		
		// Crear mensaje de menú

		String menu =  "Elige una operacion:\n";
		       menu += "1.- Area de rectangulo\n";
		       menu += "2.- Area de triangulo\n";
		       menu += "3.- Area de circulo\n";
		       menu += "4.- Salir";

	
		
		// Inicialización de valores y menu

		int m1 = Integer.parseInt(JOptionPane.showInputDialog(menu));

		double v1;

		double pi = 3.141592;

		switch (m1) {

			case 1: {	// Calcular A de rectángulo

				v1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce la longitud (m) de un lado"));

				v1 *= Double.parseDouble(JOptionPane.showInputDialog("Introduce la longitud (m) del otro lado"));

				System.out.println("El rectangulo tiene " + v1 + "(m^2)");				

				break;

			}

			case 2: {	// Calcular A de triángulo

				v1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce la longitud (m) de la base"));

				v1 *= (Double.parseDouble(JOptionPane.showInputDialog("Introduce la altura (m)")))/2;

				System.out.println("El triangulo tiene " + v1 + "(m^2)");				

				break;

			}

			case 3: {	// Calcular A de círculo

				v1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el radio (m) del circulo"));

				v1 *= (v1*pi);

				System.out.println("El circulo tiene " + v1 + "(m^2)");				

				break;

			}

			case 4: {	// Mensaje confirma el fin de la aplicación

				System.out.println("Se ha cerrado la aplicacion");

			}

		}

	}

}