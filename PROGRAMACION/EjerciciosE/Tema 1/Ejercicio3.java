import javax.swing.JOptionPane;

public class Ejercicio3 {

	public static void main (String args[]) {


		//Input

		String input = JOptionPane.showInputDialog("Introduce una cantidad en euros");

		int euro = Integer.parseInt(input);


		//Calculate and print

		System.out.println("Billetes de 500: " + (euro/500));

		euro %= 500;

		System.out.println("Billetes de 200: " + (euro/200));

		euro %= 200;

		System.out.println("Billetes de 100: " + (euro/100));

		euro %= 100;

		System.out.println("Billetes de 50: " + (euro/50));

		euro %= 50;

		System.out.println("Billetes de 20: " + (euro/20));

		euro %= 20;

		System.out.println("Billetes de 10: " + (euro/10));

		euro %= 10;

		System.out.println("Billetes de 5: " + (euro/5));

		System.out.println("El resto son: " + (euro%5));


	}

}