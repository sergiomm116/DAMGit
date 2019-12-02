import java.util.Scanner;
public class PrintfTest2 {
	//~ Crear una clase que pida introducir por teclado nombre y altura en centimetros mostrando como salida: Me llamo NOMBRE y mido altura%.2f M
	public static void main (String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Introduce tu nombre: ");
		String nombre=input.nextLine();
		System.out.print("Introduce tu altura: ");
		float altura=input.nextFloat();
		System.out.printf("Me llamo $S y mi altura es %.2f", nombre, altura/100);
		
	}
}

