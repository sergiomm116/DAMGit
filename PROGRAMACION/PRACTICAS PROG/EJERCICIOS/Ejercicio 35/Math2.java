public final class Math2{
	

	static void ordenar(double[] numeros){				//Metodo de la burbuja ascendente
		double aux;
		
		for(int i=0; i < numeros.length; i++){
			for(int j=1; j < (numeros.length-i); j++){
				if(numeros[j-1] > numeros[j]){
					aux = numeros[j-1];
                    numeros[j-1] = numeros[j];
                    numeros[j] = aux;
				}
			}
		}
	}
	
	static double minimo (double numeros[]){			//Con burbuja
		ordenar(numeros);
		return numeros[0];
	}
	
	static double minimo2 (double[] numeros){			//Sin burbuja
		double n = numeros[0];
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] < n) {
				n = numeros[i];
			}
		}
		return n;
	}
	
	static double maximo (double numeros[]){			//Con burbuja
		ordenar(numeros);
		return numeros[numeros.length-1];
	}
	
	static double maximo2 (double[] numeros){			//Sin burbuja
		double n = numeros[0];
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] > n) {
				n = numeros[i];
			}
		}
		return n;
	}
	
	
	static double sumatorio (double numeros[]){
		double suma = 0;
		for (double n : numeros) {
			suma+=n;
		}
		return suma;
	}
	
	static double media (double numeros[]){
		double media = sumatorio(numeros)/numeros.length;
		return media;
	}
	
}
