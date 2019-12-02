import java.util.Scanner;
public class Ejercicio2 {
	
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
		int digitos[];
		digitos = new int[8];
		System.out.print("Introduce dia: ");
		String dia = input.nextLine();
		digitos += dia;
		System.out.print("Introduce mes: ");
		String mes = input.nextLine();
		digitos += mes;
		System.out.print("Introduce año: ");
		String anio = input.nextLine();
		digitos += anio;
		
		System.out.print(digitos);
		
		int posiciones[];
		posiciones = new int[8];
		posiciones=digitos;
		
		for (int i=0;i<=7;i++){
			int n = (int)posiciones[i];
			n = n+n;
		}
		
		
	
	}
}

