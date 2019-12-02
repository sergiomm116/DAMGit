import java.util.Scanner;
public class Ejercicio9 {
	
	public static void main (String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Escribe un numero positivo y lo pasare a binario: ");
		int n=input.nextInt();
		int print=n;
		String binario="";
		do {
			binario=n%2+binario;
			n=n/2;	
		} while (n>0);
			System.out.print("El numero "+print+" en binario es: "+binario);
		
	}
}

