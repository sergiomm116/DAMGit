import javax.swing.JOptionPane;

public class Ejemplo1 {

	public static void main (String args[]) {

		int number = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero entre 1 y 1000"));	//Se introduce número

		if (number >= 1 && number <= 1000) {									//Condición de que el número esté entre 1 y 1000

			if ((number-1)%10==0) System.out.println("Numero acaba en 1");						//Condición de que el número termina en 1 y mensaje

			else System.out.println("No acaba en 1");								//No acaba en 1

		}

		else {													//No está entre 1 y 1000

			System.out.println("El numero esta fuera del rango permitido");

		}

	}

}