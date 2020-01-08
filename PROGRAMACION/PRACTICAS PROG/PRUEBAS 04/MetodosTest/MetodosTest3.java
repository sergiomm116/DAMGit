//Metodos que llaman a otros Metodos
import java.util.*;
public class MetodosTest3 {
	public static void main (String args[]){
		Scanner teclado=new Scanner(System.in);
		System.out.print("Introduce un numero: ");
		int numero=teclado.nextInt();
		tabla(numero);
	}
	static void tabla(int numero){
		for(int i=1;i<=10;i++)
			System.out.printf("%2d x %2d = %2d\n",numero,i,producto(numero,i));
	}
	static int producto(int numero,int i){
		return numero*i;
	}
}
