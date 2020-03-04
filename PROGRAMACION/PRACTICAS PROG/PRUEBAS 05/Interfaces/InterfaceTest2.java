//Las Interfaces se crean para ser implementadas en algun momento
interface Modificacion{
	String texto="Resultado";
	void incremento(int a);
}
public class InterfaceTest2 implements Modificacion{//implements obliga a definir los Metodos de la Interface
	//Dentro de esta clase, como si se tratara de una clase heredada, se tiene acceso directo a las propiedades
	//de la Interface
	private int valor;
	InterfaceTest2(int i){
		valor=i;
	}
	public int getValor(){
		return valor;
	}
	public void incremento(int a){//Declaracion del Metodo de la Interface
		valor+=a;
	}
	public static void main(String args[]){
//		Modificacion m1=new Modificacion();//Error, una interface no puede ser instanciada
		InterfaceTest2 p=new InterfaceTest2(25);
			p.incremento(12);
			System.out.println(texto+": "+p.getValor());//Las propiedades de la Interface, se "nominan"
														//directamente dentro de la clase que implementa
														//Salida: "Resultado: 37" 
	}
}

