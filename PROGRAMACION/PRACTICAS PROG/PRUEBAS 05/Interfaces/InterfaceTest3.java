interface Modificacion2{
	String texto="Resultado";
	void incremento(int a);
}
public class InterfaceTest3{
	private int valor;
	InterfaceTest3(int i){
		valor=i;
	}
	public int getValor(){
		return valor;
	}
	public static void main(String args[]){
		InterfaceTest3 p=new InterfaceTest3(25);
//			p.incremento(12);//Error, ahora la clase no implementa a la Interface, y por tanto no tiene acceso al Metodo
//			Modificacion2.incremento(12);//Error, el Metodo no es static
			System.out.println(Modificacion2.texto+": "+p.getValor());//A las propiedades de la Interface, se accede
																	//como a las propiedades static de cualquier clase
																	//Salida: "Resultado: 25" 
	}
}
