import java.util.Arrays;

public class MetodosStringRepaso {

	public static void main (String args[]) {

		String texto1 = "Texto para hacer las pruebas";

		String texto2 = "texto para hacer las pruebas";

		char tabla1[] = {'P','r','u','e','b','a'};

		String texto3 = "Texto";

		char tabla2[] = new char[10];

		String texto4 = "Txt";

		String texto5 = "En" + '\n' + "dos lineas";

		String texto6 = "1a2b3c4d5e66f";

		int valor1 = 1234;



		System.out.println(texto1.charAt(2));

		System.out.println(texto1.compareTo(texto2));

		System.out.println(texto1.compareToIgnoreCase(texto2));

		System.out.println(texto1.concat(texto2));

		System.out.println(texto1.copyValueOf(tabla1));

		System.out.println(texto1.endsWith("as"));

		System.out.println(texto1.equals(texto2));

		System.out.println(texto1.equalsIgnoreCase(texto2));

		System.out.println(Arrays.toString(texto3.getBytes()));

		texto1.getChars(1,3,tabla2,1);					

		System.out.println(Arrays.toString(tabla2));



		// Indexes

		System.out.println(texto1.indexOf("a"));

		System.out.println(texto1.indexOf("a",7+1));

		System.out.println(texto1.lastIndexOf("a"));

		System.out.println(texto1.lastIndexOf("a",7));

		System.out.println(texto1.length());



		// Matching methods

		System.out.println(texto4.matches("T"));

		System.out.println(texto4.matches("T.*"));

		System.out.println(texto5.matches(".+\n.+"));

		System.out.println("---------------------");

		System.out.println(texto1.matches("[Txe].+"));

		System.out.println(texto1.matches(".*[^wk].*"));

		System.out.println(texto1.matches("[a-z]"));

		System.out.println(texto1.matches(".*[a-x&&r-z].*"));

		System.out.println(texto1.matches(".+[a-x&&[âcd]].+"));


	
		// Match with numbers

		System.out.println("---------------------");

		System.out.println(texto6.matches(".*\\d.*"));

		System.out.println(texto6.matches(".*\\D.*"));

		System.out.println(texto6.matches(".*\\d{3}.*"));

		System.out.println(texto6.matches(".*\\d{1,}.*"));

		System.out.println(texto6.matches(".*\\d{1,3}.*"));



		// String edit

		System.out.println(texto1.replace('e','*'));

		System.out.println(texto1.replace(" p", "--"));

		System.out.println(texto1.replaceFirst("e","*"));

		System.out.println(texto1.substring(1,8));

		System.out.println(Arrays.toString(texto3.toCharArray()));

		System.out.println(texto3.toLowerCase());

		System.out.println(texto3.toUpperCase());

		System.out.println(texto1);

		System.out.println(texto1.trim());

		System.out.println(texto1.valueOf(texto3));

		System.out.println(texto1);					//Text gone??

	}

}