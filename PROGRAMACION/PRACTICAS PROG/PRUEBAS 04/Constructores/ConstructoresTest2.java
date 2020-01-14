import java.util.*;
class MConstructor{
	String nombre;
	int edad=25;
	MConstructor(){
		this("Angel",32);
	}
	MConstructor(String nombre,int edad){
		this.nombre=nombre;
		this.edad=edad;
		escribe();
	}
	MConstructor(String nombre){
		this.nombre=nombre;
		System.out.println("Nombre: "+this.nombre+", edad: "+this.edad);
	}
	void escribe(){
		System.out.println("Nombre: "+this.nombre+", edad: "+this.edad);
	}
}
public class ConstructoresTest2{
	public static void main(String args[]){
		MConstructor obj1=new MConstructor();
	}
}
	

