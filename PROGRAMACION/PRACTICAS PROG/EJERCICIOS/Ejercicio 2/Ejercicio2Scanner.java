import java.util.Scanner;
public class Ejercicio2Scanner {

	
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
    	
    	System.out.print("Introduce el radio de la circunferencia en metros: ");
    	double r = input.nextDouble();
		double pi = 3.141592;
		double p = (2*pi*r*100);
		double a = (pi*r*r*10000);	
		
		System.out.println("El perimetro de la circunferencia es: "+p+"cm.");
		System.out.println("El area de la circunferencia es : "+a+"cm\u00b2.");
	}
}
