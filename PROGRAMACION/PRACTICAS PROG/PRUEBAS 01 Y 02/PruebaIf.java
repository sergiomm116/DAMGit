import java.util.Scanner;
public class PruebaIf {
	
	public static void main (String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Introduce dos numeros enteros y te dire cual es el menor de ellos: ");
		int x=input.nextInt();
		int y=input.nextInt();
		if (x<y) {
			System.out.println(x+" es menor que "+y);
		} else {
			System.out.println(y+" es menor que "+x);
		}
	}
}

