//No es obligatorio que una clase tenga Metodo main(), unicamente podran ser
//llamados sus Métodos creando una instancia de la clase desde otra clase
class ClasesTest3{
	static String nombre="Angel";
	public static void metodo1(String args[]){ 
		saluda();
		Secundaria3.saluda();
	} 
	static void saluda(){ 
		System.out.println(nombre+" saludando desde Principal");//Llamando a un atributo estatico desde la misma clase
	}
} 
class Secundaria3{
	static void saluda(){ 
		System.out.println(ClasesTest3.nombre+" saludando desde Secundaria");//Lamando a un atributo estatico desde otra clase
	}
} 
