public class ClaseStringMetodos {

	public static void main (String args[]) {

		//Ambas son licencias que da Java respecto a la construcción de String o Array, sin usar sus constructores

		String texto1 = "Perro";

		String texto2 = new String("Perro");

		int array1[] = {1,3,7,2};

		

		// Clases envolventes

		Integer var3 = 7;

		int var2 = 12;



		// What the hell Java?

		System.out.println(texto1==texto2);

		System.out.println(texto1.hashCode());

		System.out.println(texto2.hashCode());



		// BUT BUT

		String text3 = "Casa";

		String text4 = "Casa";

		System.out.println(text3==text4);



		// This is getting weird...

		String text5 = new String("Tercero");

		String text6 = new String("Tercero");

		System.out.println(text5==text6);

		System.out.println(text5.hashCode());

		System.out.println(text6.hashCode());

	}

}