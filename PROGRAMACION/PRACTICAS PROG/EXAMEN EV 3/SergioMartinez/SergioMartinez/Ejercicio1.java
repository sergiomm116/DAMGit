import java.util.Scanner;

public class Ejercicio1 {

    public static void main (String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.print("Introduce palabra a cifrar: ");
        String palabra = input.nextLine();
        char[] cifrado = {'B', 'C', 'A', 'Q', 'U', 'E', 'O', 'G', 'E', 'P', 'L', 'H', 'R', 'N'};
        char[] descifrado = new char[palabra.length()];


        System.out.print("\nPalabra cifrada: [");
        for (int i = 0; i < cifrado.length; i++) {
            System.out.printf("%c, ",cifrado[i]);
        }

        for (int i = 0; i < palabra.length(); i++) {
            descifrado[i] = palabra.charAt(i);
        }

        System.out.print("\b\b]\nClave de descifrado: [");
        for (int i = 0; i < palabra.length(); i++) {
            for (int j = 0; j < cifrado.length; j++) {
                if (descifrado[i] == cifrado[j]) {
                    System.out.printf("%d, ", j);
                    break;
                }
            }
        }
        System.out.print("\b\b]");


    }
}
