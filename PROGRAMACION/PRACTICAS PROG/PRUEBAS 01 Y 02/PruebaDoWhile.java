import java.util.Scanner;
public class PruebaDoWhile {
	
	
	public static void main (String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Introduce un numero del 1 al 9 y te dire su tabla de multiplicar: ");
		int n = input.nextInt();
		int m = 1;
		if (n>1 && n<10) {
			do { 
				System.out.println(n+" x "+m+" = " +n*m++);
			} while (m<11);
		} else {
			System.out.println("Error: El numero introducido no se comprende entre 1 y 9.");
		}
	}
}
