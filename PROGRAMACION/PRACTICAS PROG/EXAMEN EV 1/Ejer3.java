//~ Crear una clase que rellene aleatoriamente 5 posiciones en un Array de 10 posiciones con las cinco vocales sin repetir. 
//~ Las vocales deben estar separadas por comas y mostrando los huecos vacioes del Array. 
//~ Tambien debe mostrar el numero de las posiciones sin ocupar. 
public class Ejer3 {
	
	public static void main (String[] args) {
		
		char letras[]=new char[10];
		char vocales[]=new char[]{'a','e','i','o','u'};
		int posicion;
		for(int i=0;i<5;){
			posicion=(int)(Math.random()*10);
			if(letras[posicion]=='\u0000'){
				letras[posicion]=vocales[i];
				i++;
			}	
		}
		System.out.print("[");
		for(char letra:letras){
			System.out.print(letra+",");
		}
		System.out.print('\b'+"]");
		
	}
}

