public class MatchesTest {

	public static void main (String args[]) {

		String cadena1 = "Texto con 12";

		System.out.println(cadena1.matches("x")); 		// Solo puede contener x, ser la cadena x. Igual con txo

		System.out.println(cadena1.matches("[abc]")); 		// a,b ó c

		System.out.println(cadena1.matches("[^abc]"));		// Que no sea ni a, ni b, ni c

		System.out.println(cadena1.matches("[a-z]"));		// Letras que estén entre a y z. Coge todos los de ASCII

		System.out.println(cadena1.matches("[a-z&&r-y]"));	// Intersección entre rangos

		System.out.println(cadena1.matches("Ta."));		// Comienza por T y solo tiene un caracter después

		System.out.println(cadena1.matches("Tex?"));		// La x del final es opcional

		System.out.println(cadena1.matches("W.*"));		// Comienza por W y pueden haber varios o ningún caracter a continuación

		System.out.println(cadena1.matches("W.+"));		// Comienza por W y tiene que tener al menos un caracter delante

		System.out.println(cadena1.matches("T.*\\d[2]"));	// Tiene que haber 2 números

	}

}