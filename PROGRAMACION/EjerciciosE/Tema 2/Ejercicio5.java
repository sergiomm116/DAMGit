import javax.swing.JOptionPane;

public class Ejercicio5 {

	public static void main (String args[]) {



		//Input n1,n2,n3 and create a save value

		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce n1"));

		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce n2"));

		int n3 = Integer.parseInt(JOptionPane.showInputDialog("Introduce n3"));

		int save = 0;



		//Output the input

		System.out.println("Entrada: " + n1 + ", " + n2 + ", " + n3);



		//Operate to sort the values

		if (n1 > n2) {

			save = n1;

			n1 = n2;

			n2 = save;

		}

		if (n1 > n3) {

			save = n1;

			n1 = n3;

			n3 = save;

		}

		if (n2 > n3) {
			
			save = n2;

			n2 = n3;

			n3 = save;

		}



		//Output the sorted input

		System.out.println("Salida: " + n1 + ", " + n2 + ", " + n3);


	}

}