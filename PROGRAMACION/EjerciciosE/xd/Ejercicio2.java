import java.util.Scanner;

public class Ejercicio2 {
	
	public static void main(String args[]) {
		
		Scanner keyboard = new Scanner(System.in);
		
		Granja granja = new Granja();
		
		String raza, nombre;
		
		int edad;
		
		System.out.println("Nueva granja creada.");
		
		for(int i=0; i<10; i++) {
			
			System.out.print("Introduce raza del animal: ");
			
			raza = keyboard.nextLine();
			
			System.out.print("Nombre del animal: ");
			
			nombre = keyboard.nextLine();
			
			System.out.print("Edad del animal: ");
			
			edad = keyboard.nextInt();
			
			granja.recibeAnimal(new Animal(raza,edad,nombre));
			
			keyboard.nextLine();
			
			System.out.println();
			
		}
		
		System.out.println("Animales menores de 4 años: " + (10-granja.cuantosMayores(5)));
		
		System.out.println("Datos de los perros: ");
		
		granja.datosSegunRaza("Perro");
		
		keyboard.close();
		
	}

}
