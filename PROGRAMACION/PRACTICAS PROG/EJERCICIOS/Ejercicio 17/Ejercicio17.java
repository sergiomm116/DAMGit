import java.util.Scanner;
public class Ejercicio17 {
	
	public static void main (String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Introduce un numero y te indicare su factorial: ");
		int numero=input.nextInt();
		int n=numero;
		int f=1;
		while(n!=0){
			f=f*n;
			n--;
		}	
			System.out.println("El factorial de "+numero+" es "+f);	
	}
}

