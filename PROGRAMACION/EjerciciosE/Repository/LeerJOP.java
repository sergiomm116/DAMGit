import javax.swing.JOptionPane;

public class LeerJOP{

	public static void main (String[] args) {

		String nombre3 = JOptionPane.showInputDialog("Introduce a raidus to calculate dimensions of circle...");

		int radius = -1;

		double pi = 3.141592;

		try {

			radius = Integer.parseInt(nombre3);

		}

		catch (NumberFormatException e) {

			System.out.println("Cannot perform the operation correctly");

			radius = -1;

			pi = 1;

		}

		System.out.println("Perimeter of your circumference: " + (radius*2*pi) + "(m)");

		System.out.println("Area of your circle: " + (radius*radius*pi) + "(m\u00b2)");

	}

}
