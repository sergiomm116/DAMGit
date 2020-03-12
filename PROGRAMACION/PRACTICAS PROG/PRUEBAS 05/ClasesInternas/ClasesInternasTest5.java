//1.- Clases internas regulares
//Ahora bien, el uso de this dentro de una clase Interna, como es logico
//estaría referido al objeto de la clase Interna
class Contenedora5{
	String texto;
	class Interna5{
		void mInterno(String texto){
			Contenedora5.this.texto=texto;//Cualificando this con el nombre
										  //de la clase Contenedora, resolvemos la
										  //ambigüedad
			System.out.println(texto);
		}
	}
}
public class ClasesInternasTest5{
	public static void main(String args[]){
		Contenedora5 ci1=new Contenedora5();
		Contenedora5.Interna5 ci1ci=ci1.new Interna5();
		ci1ci.mInterno("Texto para clase Interna");
	}
}
