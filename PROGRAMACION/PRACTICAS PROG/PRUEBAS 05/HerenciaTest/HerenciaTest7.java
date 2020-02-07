//Pero volvamos a la Soucion Madre6S1, y ahora supongamos que
//la clase Hija tiene mas constructores, desde ellos, también se intentaria
//invocar a super()
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
		super(v);
	}
	Hija1(int v,int x){//Error porque intentaria invocar a super()
		valor=v*x;
	}
	void escribir(){
		System.out.println(valor*2);//Escribe 8
	}
}
public class HerenciaTest7{
	public static void main(String args[]){
		Hija1 objh=new Hija1(4);
		objh.escribir();//Oculta al Método escribir() de la clase Madre, como sabemos
	}
}
