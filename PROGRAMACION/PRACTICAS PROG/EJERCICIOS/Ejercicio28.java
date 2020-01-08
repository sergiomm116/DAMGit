/*
28. Crear una clase que posea el metodo sobrecargado "suma" de tal forma que sume y retorne el resultado 
independientemente de los tipos de datos de los sumandos.
 */


public class Ejercicio28{
	
	public static void main (String[] args) {
		Ejercicio28 obj1=new Ejercicio28();			//Necesario porque suma no es estatico (public static int suma)
		System.out.println(obj1.suma(51.2,40));		//obj1.suma 
	
	}
	public int suma(int s1,int s2){
		return s1+s2;
	}
	public double suma(double s1,int s2){
		return s1+s2;
	}
	public double suma(int s1,double s2){
		return s1+s2;
	}
	public double suma(double s1,double s2){
		return s1+s2;
	}
	
	
}

