
public class ex1 {
	
	public static int[] ordenaParImpar (int[] numeros) {
		
		int[] impares = new int[numeros.length];
		int[] pares = new int[numeros.length];
		
		int par = 0;
		int impar = 0;
		
		
		//Separacion pares e impares
		for(int i = 0; i < numeros.length; i++){
			
			if(numeros[i]%2==0){
				pares[par]=numeros[i];
				par++;
			}else{
				impares[impar]=numeros[i];
				impar++;
			}
		}
		
		//Ordenar pares e impares
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
		
		for(int i=0; i < impar; i++){
			for(int j=1; j < (impar-i); j++){
				if(impares[j-1] > impares[j]){
					aux = impares[j-1];
                    impares[j-1] = impares[j];
                    impares[j] = aux;
				}
			}
		}
		
		//Juntar pares e impares ordenados y separados
		int j = 0;
		
		for (int i = par; i < numeros.length; i++){
			pares[i]=impares[j];
			j++;
		}
		
		//Volcar en numeros
		for(int i = 0; i < numeros.length; i++){
			numeros[i]=pares[i];
		}
		
		for (int i : numeros){
			System.out.print(i+" ");
		}
		
		return numeros;
	}
	
	public static void main (String[] args) {
		
		int numeros[] = new int[10];
		
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int)(Math.random()*99+1);
		}
		
		ordenaParImpar(numeros);
		
	}
}

