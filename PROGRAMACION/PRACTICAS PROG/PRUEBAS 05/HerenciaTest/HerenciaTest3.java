//Los constructores no se heredan
class Madre1{
	protected Madre1(){
		System.out.println("Estoy en madre1");
	}
	void mmadre2(){
		System.out.println("Estoy en madre2");
	}	
}
class Hija1 extends Madre1{
	Hija1(){//Hay que crear un Constructor en la clase Hija, para poder llamar
			//mediante super() al Constructor de la clase Madre
		super();//Llamada al constructor de la clase Madre, que implicitamente
				//se hará también
		System.out.println("Estoy en hija1");
	}
	void mmadre2(){
		System.out.println("Esta madre es desde hija");
		
	}
}
public class HerenciaTest3{
	public static void main(String args[]){
		Hija1 objh=new Hija1();//Al instanciar la clase Hija, se ejecuta el constructor de esta clase
	}
}
