public class Ejercicio4 {

	public static void main (String args[]) {

		char char_1 = (char) ((Math.random()*26) + 97);							//Generar letra

		boolean vocal = char_1=='a' || char_1=='e' || char_1=='i' || char_1=='o' || char_1=='u';	//Comprobar si es una de las vocales

		System.out.println("La letra " + char_1 + " es vocal: " + vocal);				//Imprimir mensaje

	}

}