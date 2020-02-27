class Granja {
	
	Animal[] animales;
	
	public Granja (){
		animales = new Animal[10];
	}
	
		public void recibirAnimal(Animal animal) {
		int i = 0;
		boolean ocupado = false;
			while(ocupado != true && i < animales.length){
				
				if(animales[i]==null){
					animales[i]= animal;
					ocupado = true;
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
				if(animal.razaGet().equals(raza)){
					System.out.println(animal.nombreGet()+" "+animal.edadGet());
				}
			}
		}
}
