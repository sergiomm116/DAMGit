
public class Granja {

	private Animal[] animales;
	
	Granja() {
		
		animales = new Animal[10];
		
	}
	
	public void recibeAnimal(Animal animal) {
		
		for (int i=0; i<10; i++) {
			
			if (animales[i]==null) {
				
				animales[i] = animal;
				
				break;
			}
			
			if (i>=9) {
				
				System.out.println("Granja llena...");
				
				break;
				
			}
			
		}
		
	}
	
	public int cuantosMayores(int edad) {
		
		int counter = 0;
		
		for (Animal animal : animales) {
			
			if (animal.edadGet()>edad) counter++;
			
		}
		
		return counter;
		
	}
	
	public void datosSegunRaza(String raza) {
		
		boolean foundany = false;
		
		for (Animal animal : animales) {
			
			if (animal.razaGet().equalsIgnoreCase(raza)) {
				
				System.out.println(animal.nombreGet() + " --- " + animal.edadGet());
				
				foundany = true;
				
			}
			
		}
		
		if(!foundany) {
			
			System.out.println("Esta raza no está en la granja");
			
		}
		
	}
	
}
