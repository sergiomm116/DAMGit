//1.- Clases internas regulares
//Los objetos de la clase Interna, solo tienen sentido
//dentro de la clase Contenedora
class Contenedora2{
	class Interna2{
		void mInterno(){
			System.out.println("Clase Interna");
		}
	}
	Interna2 ci=new Interna2();//ci se convierte en una propiedad de la clase Contenedora
}
public class ClasesInternasTest2{
	public static void main(String args[]){
		Contenedora2 ci1=new Contenedora2();
		ci1.ci.mInterno();//por ello, de esta forma podremos acceder a elementos de la Clase Interna
	}
}
