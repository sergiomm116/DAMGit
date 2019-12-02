import java.util.Arrays;

public class StringTest1 {
	
	public static void main (String[] args) {
		String texto1="Perro";							//hashCode
		String texto2= new String ("Perro");
		Integer var1=7;
		System.out.println(var1.hashCode());
		System.out.println(texto1.hashCode());
		System.out.println(texto2.hashCode());
		
		
		String letras="abcdef";							//charAt
		
		char var2=letras.charAt(5);
		System.out.println(var2);
		
		
		System.out.println(texto1.compareTo(texto2));	//compare.To
		System.out.println(texto1.compareTo(letras));
		
		
		String suma="";									//concat
		suma=(suma.concat(letras));
		System.out.println(suma);
		
		
		byte array1[]=texto1.getBytes();				//getBytes
		System.out.println(Arrays.toString(array1));
		
		
		String cadena="casa";							//indexOf
		System.out.println(cadena.indexOf("s"));
		System.out.println(cadena.indexOf("z"));
		System.out.println(cadena.indexOf("as"));
		System.out.println(cadena.indexOf("a", 2));
		
		
		System.out.println(cadena.lastIndexOf("a"));	//lastIndexOf
		
		
	}
}
