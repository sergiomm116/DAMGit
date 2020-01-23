import javax.swing.JOptionPane;

public class Ejemplo3 {

	public static void main (String args[]) {

		String dia = JOptionPane.showInputDialog("Introduce dia de la semana");

		switch (dia) {

			case "Lunes":

			case "Martes":

			case "Miercoles":

			case "Jueves":

			case "Viernes": 
				System.out.println("El dia " + dia + " es un dia laborable");
				break;

			case "Sabado":

			case "Domingo":
				System.out.println("El dia " + dia + " es un dia festivo");
				break;

		}

	}

}