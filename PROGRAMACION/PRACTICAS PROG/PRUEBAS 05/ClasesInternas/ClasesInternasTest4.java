//1.- Clases internas regulares
//Las clases internas pueden acceder directamente a Propiedades y Metodos de la
//clase Contenedora, incluso aunque sean privados
class Contenedora4{
	private String texto;
	private int mContenedor(){
		return 5;
	}
	class Interna4{
		void mInterno(){
			texto="Desde la Clase Interna";
			System.out.println(texto+mContenedor());
		}
	}
}
public class ClasesInternasTest4{
	public static void main(String args[]){
		Contenedora4 ci1=new Contenedora4();
		Contenedora4.Interna4 ci1ci=ci1.new Interna4();
		ci1ci.mInterno();
	}
}
