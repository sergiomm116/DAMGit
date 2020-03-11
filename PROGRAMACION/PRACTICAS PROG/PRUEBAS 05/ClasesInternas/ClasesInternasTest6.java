//2.- Clases internas a un Metodo
//Se declaran dentro de un Metodo
//y solo pueden ser usadas dentro del Metodo
class Contenedora6{
	void ContieneInterna(){
		class Interna6{//Clase interna al Metodo ContieneInterna()
			void mInterno(){
				System.out.println("Clase Interna");
			}
		}
	}
//	Interna6 ci=new Interna6();//La creacion de un objeto fuera del Metodo
								//crearia un error
}
public class ClasesInternasTest6{
	public static void main(String args[]){
		Contenedora6 ci1=new Contenedora6();
//		Contenedora6.Interna6 c6i6=ci1.new Interna6();//Aquí tambien se crearia
														//un error de compilacion
	}
}

