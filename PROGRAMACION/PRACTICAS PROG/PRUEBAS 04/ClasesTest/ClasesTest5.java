//No obstante, para acceder a un Metodo o propiedad "no estatico" desde otro
//Metodo "no estatico" de la misma clase no se necesita crear un objeto de la clase
class ClasesTest5{
	String nombre="Angel";
	public static void main(String args[]){
		ClasesTest5 obj1=new ClasesTest5(); 
		System.out.println(obj1.nombre+" saludando al entrar");
		obj1.saluda();
	} 
	void saluda(){ 
		System.out.println(nombre+" saludando desde Principal"); 
		adios();//Llamamos a un Metodo de la misma clase
	}
	void adios(){
		System.out.println(nombre+", adios");//Llamamos a una propiedad de la misma clase
	} 
} 
