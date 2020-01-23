import javax.swing.JOptionPane;

public class Ejemplo2 {

	public static void main (String args[]) {

		char letter = (JOptionPane.showInputDialog("Introduce una letra")).charAt(0);

		if (letter >= 65 && letter <= 90) {

			System.out.println("Es una mayuscula");

		}

		else {

			if (letter >= 97 && letter <= 122) {

				System.out.println("Es una minuscula");

			}

			else {

				System.out.println("Tipo de letra no encontrado. Entrada fuera de rango.");

			}

		}

	}

}