
public class Animal {
	
	private String raza;
	
	private int edad;
	
	private String nombre;
	
	
	
	Animal (String raza, int edad, String nombre) {
		
		this.raza = raza;
		
		this.edad = edad;
		
		this.nombre = nombre;
		
	}
	
	
	public String razaGet() {
		
		return raza;
		
	}
	
	public int edadGet() {
		
		return edad;
		
	}
	
	public String nombreGet() {
		
		return nombre;
		
	}
	
}
