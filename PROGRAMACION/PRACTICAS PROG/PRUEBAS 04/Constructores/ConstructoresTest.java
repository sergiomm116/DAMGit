import java.util.*;
class MConstructor{
	String nombre;
	int edad;
	MConstructor(String nombre,int edad){
		this.nombre=nombre;
		this.edad=edad;
		escribe();
	}
	void escribe(){
		System.out.println("Nombre: "+this.nombre+", edad: "+this.edad);
	}
}
public class ConstructoresTest{
	public static void main(String args[]){
		Scanner teclado=new Scanner(System.in);
		System.out.print ("Introduce nombre: ");
		String nombre=teclado.nextLine();
		System.out.print ("Introduce edad: ");
		int edad=teclado.nextInt();
		MConstructor obj1=new MConstructor(nombre,edad);
	}
}
	

