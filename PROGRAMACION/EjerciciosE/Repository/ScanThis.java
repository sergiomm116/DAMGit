import java.util.Scanner;
import java.io.*;

public class ScanThis {

	public static void main (String args[]) throws IOException{

		//Scanner test

		Scanner texto = new Scanner(System.in);

		System.out.print ("Introduce numero: ");

		int nombre_1 = texto.nextInt();			//next() is interesting for reading text files (tables)

		System.out.println(nombre_1);			//nextInt() doesn't read linebreak, so it still has content afterwards, and doesn't wait for the next nextLine()

		System.out.print ("Introduce nombre: ");

		String nombre_2 = texto.nextLine();

		System.out.println(nombre_2);

		Scanner file_1 = new Scanner(new File("testing.txt"));

		System.out.println(file_1.nextLine());
			

	}

}