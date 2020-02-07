//~ 18. Crear un programa que lea 5 numeros enteros por teclado y los muestre ordenados de menor a mayor.

import java.util.Scanner;
public class Ejercicio18 {
	
	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		int n[]=new int [5];
		int i=0;
		int aux=0;
			for (i=0;i<=4;i++){
			System.out.print("Introduce un 5 numeros (llevas "+i+"): ");
			n[i]=input.nextInt();
			}
			for(i=0;i<=3;i++){
				if(n[i]>n[i+1]){
					aux=n[i];
					n[i]=n[i+1];
					n[i+1]=aux;
					i=-1;
				}
				
			}	
			for (i=0;i<=4;i++){
			System.out.print(n[i]+", ");
			}
		System.out.println("\b\b"+".");
	}
}

