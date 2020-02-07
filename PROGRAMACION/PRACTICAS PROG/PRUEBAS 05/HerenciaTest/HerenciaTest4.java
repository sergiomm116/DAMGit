//Aunque la clase Hija1_4 no tenga Constructor,
//el compilador crea un Constructor por defecto,
//cuya única linea será la llamada super()
class Madre1{
	int valor;
	Madre1(){
		valor=4;
	}
}
class Hija1 extends Madre1{
	//El compilador incluiría implicitamente éste codigo
	//	Hija1_4(){
	//		super();
	//	}
	void mhija4(){
		System.out.println(valor*4);//Escribe 16
	}
}
public class HerenciaTest4{
	public static void main (String args[]) {
		Hija1 objh=new Hija1();//Se crea un Constructor con llamada super()
		objh.mhija4();
	}
}

