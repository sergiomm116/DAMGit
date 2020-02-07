//Una soluci�n es hacer explicitamente la llamada super desde el Constructor
//de la clase Hija
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
		super(v);//Solucion
	}
	void escribir(){
		System.out.println(valor*2);//Escribe 8
	}
}
public class HerenciaTest6S1{
	public static void main(String args[]){
		Hija1 objh=new Hija1(4);
		objh.escribir();//Oculta al M�todo escribir() de la clase Madre, como sabemos
	}
}

