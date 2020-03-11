//1.- Clases internas regulares
//También podremos acceder a la clase Interna desde fuera,
//sin necesidad de hacerlo a traves de una propiedad de la clase Contenedora
class Contenedora3{
	class Interna3{
		void mInterno(){
			System.out.println("Clase Interna");
		}
	}
}
public class ClasesInternasTest3{
	public static void main(String args[]){
		Contenedora3 ci1=new Contenedora3();//Creamos objeto de la clase Contenedora
		Contenedora3.Interna3 ci1ci=ci1.new Interna3();//a traves de el, creamos un objeto de la clase Interna
		ci1ci.mInterno();//y ahora, de esta forma, podremos acceder a los elementos de la clase Interna
	}
}

