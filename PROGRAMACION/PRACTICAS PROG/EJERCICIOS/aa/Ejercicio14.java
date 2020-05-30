import java.util.Scanner;


public class Ejercicio14 {
	
	public static void main (String[] args) {
		
		System.out.println("Introduce 10 numeros: ");
		Scanner input = new Scanner(System.in);
		int num = -1;
		int contador = 0;
		int contadorP = 0;
		int contadorN = 0;
		int contador0 = 0;
		int suma = 0;
		
		for (int i = 0; i < 10; i++) {
		num = Integer.parseInt(input.nextLine());
		contador++;
		suma+=num;
			
			if (num < 0){
				contadorN++;
			}else if (num == 0){
				contador0++;
			}else{
				contadorP++;
			}
		}
		
		System.out.println(contador);
		System.out.println(contadorP);
		System.out.println(contadorN);
		System.out.println(contador0);
		System.out.println(suma);

	}
}

