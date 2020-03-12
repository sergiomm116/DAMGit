//5.- Clases internas estaticas
//Clases que pueden ser instanciadas sin necesidad de hacerlo
//a traves de un objeto de la clase Contenedora
class Contenedora10{
	public static class Interna10{
		void mInterno(){
			System.out.println("Clase Interna");
		}
	}
}
public class ClasesInternasTest10{
	public static void main(String args[]){
		Contenedora10.Interna10 ci=new Contenedora10.Interna10();//Creamos un objeto, directamente
																//de la clase interna
		ci.mInterno();
	}
}
