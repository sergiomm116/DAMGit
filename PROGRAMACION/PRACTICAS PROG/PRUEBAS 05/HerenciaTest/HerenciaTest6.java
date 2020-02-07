//Ahora, la clase Hija tiene Constructor,
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
class Hija1 extends Madre1{
	Hija1(int v){//Error: Aun habiendo constructor en la clase Hija,
					//se sigue haciendo una llamada super()
		valor=v;
	}
	void escribir(){
		System.out.println(valor*2);
	}
}
public class HerenciaTest6{
	public static void main(String args[]){
		Hija1 objh=new Hija1(4);
		objh.escribir();
	}
}
