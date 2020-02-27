class Animal {
	
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
