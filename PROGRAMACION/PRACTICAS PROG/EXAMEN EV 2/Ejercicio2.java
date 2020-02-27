import java.util.Scanner;

public class Ejercicio2 {
	
	public static void main (String[] args) {
		
	Scanner input = new Scanner (System.in);
		
    Granja granja = new Granja();
		String raza, nombre;
		int edad;
		
		for(int i = 0; i < 10; i++){
			System.out.print("Introduce la edad: ");
			edad = input.nextInt();
			input.nextLine();
			System.out.print("Introduce la raza: ");
			raza = input.nextLine();
			System.out.print("Introduce el nombre: ");
			nombre = input.nextLine();
			granja.recibirAnimal(new Animal(raza, nombre, edad));
		}
    
		System.out.println(10-granja.cuantosMayores(4)); 
    
		granja.datosSegunRaza("Perro");
	}
}

