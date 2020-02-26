import java.util.Scanner;

class Animal{
	private String raza;
	private String nombre;
	private int edad;
	
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

class Granja{
	
	Animal[] animales;
	
	public Granja (){
		animales = new Animal[10];
	}
	
	public void recibirAnimal(Animal animal) {
		int i = 0;
		boolean ocupado = false;
		while(ocupado != false && i < animales.length){
			
			if(animales[i]==null){
				animales[i] = animal;
				ocupado = true;
			}
			i++;
		}
	}
	
	//~ public int cuantosMayores(int edad){
		//~ int mayores = 0;
		
		//~ for(Animal animal : animales){
			//~ if(animal.edadGet()> edad){
				//~ mayores++;
			//~ }
		//~ }
		//~ return mayores;
	//~ }
	
	
	
	public void datosSegunRaza(String raza){
		for(Animal animal : animales){
			if(animal.razaGet() == raza){
				System.out.println(animal.nombreGet()+" "+animal.edadGet());
			}
		}		
	}
}

public class ex2 {
	
	public static void main (String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		    Granja granja = new Granja();
				String raza; 
				String nombre;
				int edad;
		
		for(int i = 0; i < 1; i++){
			System.out.println("Introduce la edad (animal "+(i+1)+"): ");
			edad = input.nextInt();
			input.nextLine();
			System.out.println("Introduce la raza (animal: "+(i+1)+"): ");
			raza = input.nextLine();
			System.out.println("Introduce el nombre (animal: "+(i+1)+"): ");
			nombre = input.nextLine();
			granja.recibirAnimal(new Animal(raza, nombre, edad));
		}
		
			//~ System.out.println(granja.cuantosMayores(4));
			
			granja.datosSegunRaza("Perro");
			
			
		}
		
}


