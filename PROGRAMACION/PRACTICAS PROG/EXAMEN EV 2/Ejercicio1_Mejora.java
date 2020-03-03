import java.util.Arrays;
public class Ejercicio1_Mejora {
	
	public static int[] ordenaParImpar(int[] numeros) {
		
		//Se declaran dos arrays auxiliares para guardar los pares[] e impares[]
		int[] impares = new int[numeros.length];
		int[] pares = new int[numeros.length];
		
		//Inicializacion indices de pares e impares
		int par = 0;
		int impar = 0;
		
		
		//Separacion entre pares e impares, se consigue el indice maximo de cada array
		for(int i = 0; i < numeros.length; i++){
			
			if(numeros[i]%2==0){
				pares[par]=numeros[i];
				par++;
			}else{
				impares[impar]=numeros[i];
				impar++;
			}
		}
		for (int i : pares){
				System.out.print(i+" ");
			}
		System.out.println();
		for (int i : impares){
				System.out.print(i+" ");
			}
		System.out.println();
		
		
		//sort en vez de burbuja
		Arrays.sort(pares);

		Arrays.sort(impares);
		
		//Se guardan los impares[] en el array pares[] a partir del indice maximo "par"
		int j = 0;
		
		for (int i = par; i < numeros.length; i++){
			pares[i]=impares[j];
			j++;
		}
		
		//Se devuelven todos los valores guardados en el array pares[] de vuelta al array numeros[]
		for(int i = 0; i < numeros.length; i++){
			numeros[i]=pares[i];
		}
		
		//Return del array numeros
		
		return numeros;
	}
	
	
		public static void main (String[] args) {
			int [] numeros = {1,2,3,4,5,6,7,8};
			
			for (int i : numeros){
				System.out.print(i+" ");
			}
			System.out.println();
			
			ordenaParImpar(numeros);
			System.out.println();
			
			for (int i : numeros){
				System.out.print(i+" ");
			}
		}
}
