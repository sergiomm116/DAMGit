//Cuando existe ambig�edad en los nombres de los M�todos de la clase Madre e Hija,
//la llamada a los de la clase Madre se cualifica con super
class Madre1{
	protected void mmadre1(){
		System.out.println("Estoy en madre1");
	}
	void mmadre2(){
		System.out.println("Estoy en madre2");
	}	
}
class Hija1 extends Madre1{
	void mhija1(){
		System.out.println("Estoy en hija1");
	}
	void mmadre2(){
		System.out.println("Esta madre es desde hija");
		super.mmadre2();//Aqui llamo al Metodo de la clase Madre
	}
}
public class HerenciaTest2{
	public static void main(String args[]){
		Madre1 objm=new Madre1();
		objm.mmadre1();//Llamada a M�todo de la clase Madre
		Hija1 objh=new Hija1();
		objh.mmadre2();//Anulacion de M�todo de la clase Madre
		objh.mmadre1();//Llamada a M�todo de la clase Madre desde la clase Hija
	}
	
}

