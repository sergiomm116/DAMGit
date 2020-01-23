import javax.swing.JOptionPane;

public class Ejercicio3UBER {

	public static void main (String args[]) {


		//Input

		String input = JOptionPane.showInputDialog("Introduce una cantidad en euros (X.00)");

		double euro = Double.parseDouble(input);

		euro *= 100;

		int inteuro = (int) (euro);


		//Calculate and print

		System.out.println("Billetes de 500: " + (inteuro/50000));

		inteuro %= 50000;

		System.out.println("Billetes de 200: " + (inteuro/20000));

		inteuro %= 20000;

		System.out.println("Billetes de 100: " + (inteuro/10000));

		inteuro %= 10000;

		System.out.println("Billetes de 50:  " + (inteuro/5000));

		inteuro %= 5000;

		System.out.println("Billetes de 20:  " + (inteuro/2000));

		inteuro %= 2000;

		System.out.println("Billetes de 10:  " + (inteuro/1000));

		inteuro %= 1000;

		System.out.println("Billetes de 5:   " + (inteuro/500));

		euro = inteuro;

		System.out.println("El resto son:    " + (euro/100));


	}

}