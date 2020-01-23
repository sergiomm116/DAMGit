import javax.swing.JOptionPane;

public class Ejercicio7Alt {

	public static void main (String args[]) {

		int mes = Integer.parseInt(JOptionPane.showInputDialog("Introduce mes"));

		int anio = Integer.parseInt(JOptionPane.showInputDialog("Introduce anio"));

		int dias = 0;

		
		
		switch (mes) {

			case 4:

			case 6:

			case 9:

			case 11: dias=30; break;

			case 1:

			case 3:

			case 5:

			case 7:

			case 8:

			case 10:

			case 12: dias=31; break;

			case 2: {

				if (anio%4==0 && anio%100!=0 && anio%400==0) {

					dias = 28;

				}

				else {

					dias = 29;

				}	

				break;			

			}

			default: System.out.println("El mes no es correcto");

		}

		if (mes>=1 && mes <=12) {

			System.out.println("El mes " + mes + " tiene " + dias + " dias.");

		}

	}

}