//A los Metodos y propiedades "no estaticos" unicamente se puede acceder creando un objeto (con el operador new)
//de la clase que los contiene
class ClasesTest4{
	String nombre="Angel";
	public static void main(String args[]){ 
		ClasesTest4 obj1=new ClasesTest4();
		obj1.saluda(obj1);//Llamada a un Metodo "no estatico" de la misma clase
		Secundaria4 obj2=new Secundaria4();
		obj2.saluda();//Llamada a un Metodo "no estatico" de otra clase
	} 
	void saluda(ClasesTest4 obj3){ 
		System.out.println(obj3.nombre+" saludando desde Principal"); 
	}
} 
class Secundaria4{
	void saluda(){
		ClasesTest4 obj4=new ClasesTest4();
		System.out.println(obj4.nombre+" saludando desde Secundaria");//Llamada a una propiedad "no estatica" de otra clase
	}
} 

