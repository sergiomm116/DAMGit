import java.util.*;
import java.io.*;
import javax.swing.*;
public class Leer{
	public static void main(String[] args){
		//Con clase Scanner del paquete java.util
		Scanner texto=new Scanner(System.in);
		System.out.print ("Introduce nombre: ");
		String nombre1=texto.nextLine();
		System.out.println(nombre1);

		//Con clase BufferedReader del paquete java.io
		String nombre2="";
		System.out.print( "Introduzca su nombre: " );
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			nombre2 = entrada.readLine();
		}
		catch (IOException e) {}
		System.out.println(nombre2);

		//Con clase JOptionPane del paquete javax.swing
		String nombre3=JOptionPane.showInputDialog("Introduce otro");
		int number = Integer.parseInt(nombre3);
		System.out.println(nombre3);
	}
}
