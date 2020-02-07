//Ahora, la clase Madre tiene Constructor explicito,
//y la instanciacion de la clase Hija sigue haciendo una llamada super()
class Madre1{
	protected int valor;
	Madre1(int v){
		valor=v;
	}
	void escribir(){
		System.out.println(valor);
	}
}
class Hija1 extends Madre1{//Error no se puede invocar al Constructor por defecto
	void escribir(){
		System.out.println(valor*2);
	}
}
public class HerenciaTest5{
	public static void main(String args[]){
		Hija1 objh=new Hija1();
		objh.escribir();
	}
}
		

