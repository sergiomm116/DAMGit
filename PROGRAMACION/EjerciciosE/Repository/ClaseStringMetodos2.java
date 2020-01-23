import java.util.Arrays;

public class ClaseStringMetodos2 {

	public static void main (String args[]) {

		char array[] = new char[]{'P','e','r','r','o'};

		String cadena = new String ("Perro");

		byte array2[] = cadena.getBytes();

		System.out.println(Arrays.toString(array2));

		String cadena1 = "Casa";

		System.out.println(cadena1.indexOf("sa"));

		System.out.println(cadena1.replace('a','*'));

	}

}