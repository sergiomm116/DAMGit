import java.util.Scanner;

class Vehiculo {
	private String patente, marca;
	
	public String getPatente(){
		return patente;
	}
	
	public String getMarca(){
		return marca;
	}
	
	public void setPatente(String patente){
		this.patente = patente;
	}
	
	public void setMarca(String marca){
		this.marca = marca;
	}
	
}

class Autobus extends Vehiculo{
	private int numero;
	
	public int getNumero(){
		return numero;
	}
	
	public void setNumero(int numero){
		this.numero = numero;
	}
	
}

class Camion extends Vehiculo{
	private int carga;
	
	public int getCarga(){
		return carga;
	}
	
	public void setCarga(int carga){
		this.carga = carga;
	}
}

public class Ejercicio4 {
	
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("1. Agregar vehiculo \n2. Borrar vehiculo \n3. Listar vehiculos \n4. Salir \n\nElige la opcion del menu: ");
		int c = input.nextInt();
		String marca, patente;
		int numero, carga;
		boolean salir = false;
		while (!salir){
			switch(c){
				case 1:
					System.out.print("\n______\n\n1. Agregar autobus \n2. Agregar camion \n3. Cancelar \n\nElige la opcion del menu: ");
					switch(input.nextInt()){
						case 1:
							input.nextLine();
							System.out.print("Introduce la marca: ");
							marca = input.nextLine();
							System.out.print("Introduce la patente: ");
							patente = input.nextLine();
							System.out.print("Introduce el numero de asientos: ");
							numero = input.nextInt();
							input.nextLine();
						case 2:
							input.nextLine();
							System.out.print("Introduce la marca: ");
							marca = input.nextLine();
							System.out.print("Introduce la patente: ");
							patente = input.nextLine();
							System.out.print("Introduce la carga en toneladas: ");
							carga = input.nextInt();
							input.nextLine();
						case 3:
						default:
					}
				case 2:
					
				case 3:
				case 4:
				default:
			}
		}
		Camion camion1 = new Camion();
		camion1.setMarca("Volvo");
		camion1.setPatente("A321");
		camion1.setCarga(5000);
		
		Autobus autobus1 = new Autobus();
		autobus1.setMarca("Mercedes");
		autobus1.setPatente("W123");
		autobus1.setNumero(50);
	}
}

