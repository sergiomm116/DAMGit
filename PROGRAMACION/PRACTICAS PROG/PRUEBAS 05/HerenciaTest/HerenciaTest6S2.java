//Otra solución es crear Constructor por defecto en la clase Madre (Madre())
class Madre1{
	protected int valor;
	Madre1(){//Solucion
	}
	Madre1(int v){
		valor=v;
	}
	void escribir(){
		System.out.println(valor);
	}
}
class Hija1 extends Madre1{
	Hija1(int v){
		valor=v;
	}
	void escribir(){
		System.out.println(valor*2);//Escribe 8
	}
}
public class HerenciaTest6S2{
	public static void main(String args[]){
		Hija1 objh=new Hija1(4);
		objh.escribir();//Oculta al Método escribir() de la clase Madre, como sabemos
	}
}
