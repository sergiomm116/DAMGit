import java.util.Arrays;
class Out {
	
	//Declaracion Array
	int [] numeros;
	
	//Array que se le pasa al crear el objeto de Out
	Out(int[] numeros){
		this.numeros = numeros;
	}
	
	//Clase Internta con los metodos necesarios
	class In {
		
		int mayor(){
			return numeros[numeros.length-1];
		}
		
		int menor(){
			return numeros[0];
		}
		
		int media(){
			int suma = 0;
			for (int i : numeros){
				suma+=i;
			}
			return suma/numeros.length;
		}
	
	}
}


public class InnerClassTest {
	
	
	public static void main (String[] args) {
		
		//Declaracion de Array aleatorio
		int[] numeros = new int[20];
		for(int i = 0; i < 20; i++){
			int n = (int)(Math.random()*100+1);
			numeros[i] = n;
		}
		
		//Array ordenado
		Arrays.sort(numeros);
	
		//Creacion de los objetos
		Out o = new Out(numeros);
		Out.In i = o.new In();
		
		//Salida por pantalla
		for(int x : numeros){
			System.out.print(x+" ");
		}
		System.out.println();
		System.out.println("Mayor: "+i.mayor());
		System.out.println("Menor: "+i.menor());
		System.out.println("Media: "+i.media());
	}
}

