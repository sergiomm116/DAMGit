//Mas de una clase puede tener Metodo main(), pero unicamente se ejecutara el de la
//clase principal (la publica, o la que ejecutemos desde la linea de comandos)
public class ClasesTest2{
	public static void main(String args[]){ 
		saluda();
		Secundaria2.saluda();
	} 
	static void saluda(){ 
		System.out.println("Saludando desde Principal"); 
	}
} 
class Secundaria2{
	public static void main(String args[]){
		System.out.println("Metodo main() de clase Secundaria");
	}
	static void saluda(){ 
		System.out.println("Saludando desde Secundaria");
	}
} 

