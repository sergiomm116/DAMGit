import javax.swing.*;

public class SwitchTest {

	public static void main (String args[]) {

		int v1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce numero"));

		switch (v1) {

			case 1:
				System.out.println("Es un 1");
				break;

			case 2:
				System.out.println("Es un 2");
				break;

			case 3:
				System.out.println("Es un 3");


			default:
				System.out.println("Es otro numero");

		}

	}

}