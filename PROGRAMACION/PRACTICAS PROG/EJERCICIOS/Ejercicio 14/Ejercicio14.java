import java.util.Scanner;
public class Ejercicio14 {
	
	public static void main (String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Introduce 10 numeros (positivos, negativos o ceros) y te dire la media de los positivos, de los negativos y la cantidad de ceros totales: ");
			int contador=0;
			int positivos=0;
			int negativos=0;
			int contadorp=0;
			int contadorn=0;
			int contador0=0;
		for (contador=0;contador<=9;contador++){
			int n=input.nextInt();
			
			if (n>=1){
				positivos = positivos + n;
				contadorp= contadorp+1;
			}	
			if (n<=-1){
				negativos = negativos - n;
				contadorn= contadorn-1;
			}
			if(n==0){
				contador0=contador0+1;			
			}
		}
		System.out.println("Los ceros totales han sido: "+contador0);
		if (contadorp>=1){
		System.out.println("La media de los positivos ha sido: "+positivos/contadorp);
		}else{
			System.out.println("No se han introducido numeros positivos.");
		}
		if(contadorn<=-1){
		System.out.println("La media de los negativos ha sido: "+negativos/contadorn);
		}else{
			System.out.println("No se han introducido numeros negativos.");
		}
	}
}
