import java.util.Scanner;

public class Ejercicio1 {
	
	public static void main (String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Introduce palabra a cifrar: ");
		String palabra = input.nextLine();
		char[] cifrado = {'B', 'C', 'A', 'Q', 'U', 'E', 'O', 'G', 'E', 'P', 'L', 'H', 'R', 'N'};
		char[] descifrado = new char[palabra.length()];
		
		for (char i:cifrado) {
			System.out.printf("%c, ",cifrado[i]);
		}
		
		for (int i = 0; i < palabra.length(); i++) { 
            descifrado[i] = palabra.charAt(i);
            System.out.printf("%c, ",descifrado[i]);
        }
        
		
	}
}

