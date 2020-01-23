import java.io.*;

public class date {

	public static void main (String args[]) throws IOException {

		BufferedReader keyboard = new BufferedReader (new InputStreamReader (System.in));

		System.out.println("Introduce tu fecha de nacimiento en el siguiente formato dd-mm-aaaa");

		char array[] = new char[10];

		for(int i=0; i<10; i++) {

			array[i] = (char) keyboard.read();

		}

		System.out.println(array[8]);	

	}

}