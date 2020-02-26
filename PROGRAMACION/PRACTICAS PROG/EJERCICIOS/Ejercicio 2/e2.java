import java.util.Scanner;

class Granja {
	
	Animal[] animales;
	
	public Granja (){
		animales = new Animal[10];
	}
	
	public void recibirAnimal(Animal animal) {
		int i = 0;
		boolean isNull = false;
		while(isNull != false && i < animales.length){
			
			if(animales[i]==null){
				animales[i]= animal;
				isNull = true;
			}
			i++;
		}
	}
	
	public int cuantosMayores(int edad) {
		int mayores = 0;
		for (Animal animal : animales) {
			if (animal.edadGet() > edad){
				mayores++;
			}
		}
		return mayores;
	}
	
	public void datosSegunRaza(String raza) {
		for(Animal animal : animales){
			if(animal.razaGet() == raza){
				System.out.println(animal.nombreGet()+" "+animal.edadGet());
			}
		}
	}
}

class Animal {
	
	protected String raza;
	protected String nombre;
	protected int edad;
	
	
	public Animal (String raza, String nombre, int edad){
		this.raza = raza;
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public int edadGet(){
		return edad;
	}
	
	public String razaGet(){
		return raza;
	}
	
	public String nombreGet(){
		return nombre;
	}
}

public class e2 {
	
	public static void main (String[] args) {
		
		Scanner input = new Scanner (System.in);
		
    Granja granja = new Granja();
		String raza, nombre;
		int edad;
		
		for(int i = 0; i < 1; i++){
			System.out.println("edad");
			edad = input.nextInt();
			input.nextLine();
			raza = input.nextLine();
			nombre = input.nextLine();
			granja.recibirAnimal(new Animal(raza, nombre, edad));
		}
    
    System.out.println(granja.cuantosMayores(4));
    
    granja.datosSegunRaza("Perro");
	}
}
