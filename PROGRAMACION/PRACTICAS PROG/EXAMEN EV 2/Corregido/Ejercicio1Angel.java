import java.util.Arrays;
public class Ejercicio1Angel {
	
	public static int[] ordenaParImpar(int[] numeros) {
		
		//Ordenar array
		Arrays.sort(numeros);
		
		int i = 0;
		int[] aux = new int[numeros.length];
		
		//Se copian los pares
		for(int j = 0; j < numeros.length ; j++){
			if(numeros[j]%2==0){
				aux[i]=numeros[j];
				i++;
			}
		}
		
		//Se copian los impares
		for(int j = i; j < numeros.length ; j++){
			if(numeros[j]%2!=0){
				aux[i]=numeros[j];
				i++;
			}
		}
			
		
	}
}

