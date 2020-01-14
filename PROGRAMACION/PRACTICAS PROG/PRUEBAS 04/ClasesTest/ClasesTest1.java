//Dos clases en un fichero
//Unicamente una puede ser publica, el nombre del fichero coincidira con la clase publica
public class ClasesTest1{
	static String texto="Angel";
	public static void main(String args[]){ 
		saluda();//Llamada a un Metodo estatico de la misma clase
		Secundaria1.saluda();//Llamada a un Metodo estatico de otra clase
	} 
	static void saluda(){ 
		System.out.println(texto+" saludando desde Principal"); 
	}
} 
class Secundaria1{
	static void saluda(){ 
		System.out.println(ClasesTest1.texto+" saludando desde Secundaria");
	}
} 

