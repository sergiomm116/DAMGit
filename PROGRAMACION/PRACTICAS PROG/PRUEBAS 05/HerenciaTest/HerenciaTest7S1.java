//La Solución pasa por llamar al Constructor de la clase Madre explicitamente
//con super(...) (También podriamos hacerlo con this(...)
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
	Hija1(int v){
		super(v);//Con super(...), se llama al Constructor de la clase Madre, despues
				//se inicializan las variables de la clase Hija, y continua con la ejecución
				//de las instrucciones del Constructor de la clase Hija;
	}
	Hija1(int v,int x){
		super(v);//Solucion (También valdría this(v) en este caso, la llamada al Constructor
							//de la clase Madre, se hace a traves del Constructor de la Clase Hija
		valor=v*x;
	}
	void escribir(){
		System.out.println(valor*2);//Escribe 8
	}
}
public class HerenciaTest7S1{
	public static void main(String args[]){
		Hija1 objh=new Hija1(4);
		objh.escribir();//Oculta al Método escribir() de la clase Madre, como sabemos
	}
}

