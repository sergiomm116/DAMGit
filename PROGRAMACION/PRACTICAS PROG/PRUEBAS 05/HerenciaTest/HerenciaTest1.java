//Se pueden crear instancias de la clase Madre, y de la clase Hija, y acceder
//a métodos y propiedades de ambas clases (esto último, sólo desde la instancia
//de la clase Hija
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
	}
}
public class HerenciaTest1{
	public static void main(String args[]){
		Madre1 objm=new Madre1();
		objm.mmadre1();//Llamada a Método de clase Madre desde instancia de clase Madre
//		objm.mhija1();//Error, No se puede
		Hija1 objh=new Hija1();
		objh.mmadre2();//LLamada a Método de clase Hija desde instancia a clase Hija,
						//reescribiendo el código del método de la clase Madre
		objh.mmadre1();//Llamada a Método de clase Madre desde instancia a clase Hija
	}
}

