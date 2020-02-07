//~ Crear un programa que genere 6 numeros aleatorios entre 1 y 49 y los muestre ordenados de menor a mayor.
public class Ejercicio19 {
	public static void main (String[] args) {
		int n[]=new int [6];
		int i=0;
		int aux=0;
		System.out.print("Los numeros aleatorios son (ordenados de menor a mayor): ");
			for (i=0;i<=5;i++){
			n[i]=(int)(Math.random()*49+1);
			}
			for(i=0;i<=4;i++){
				if(n[i]>n[i+1]){
					aux=n[i];
					n[i]=n[i+1];
					n[i+1]=aux;
					i=-1;
				}	
			}	
			for (i=0;i<=5;i++){
				System.out.print(n[i]+", ");
			}
		System.out.println("\b\b"+".");
	}
}

