public class Ejercicio1 {
	
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
		
		//Ordenar pares[] por el metodo de la burbuja, con ayuda del indice maximo "par"
		int aux = 0;
		
		for(int i=0; i < par; i++){
			for(int j=1; j < (par-i); j++){
				if(pares[j-1] > pares[j]){
					aux = pares[j-1];
                    pares[j-1] = pares[j];
                    pares[j] = aux;
				}
			}
		}
		//Ordenar impares[] por el metodo de la burbuja, con ayuda del indice "impar"
		for(int i=0; i < impar; i++){
			for(int j=1; j < (impar-i); j++){
				if(impares[j-1] > impares[j]){
					aux = impares[j-1];
                    impares[j-1] = impares[j];
                    impares[j] = aux;
				}
			}
		}
		
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
}

