//5.- Clases internas estaticas
//Desde ellas no se puede acceder a ningun elemento de la clase Contenedora
class Contenedora11{
	String texto;
	public static class Interna11{
		void mInterno(){
//			System.out.println(texto);//Esto generaria un error
		}
	}
}
public class ClasesInternasTest11{
	public static void main(String args[]){
		Contenedora11.Interna11 ci=new Contenedora11.Interna11();
		ci.mInterno();
	}
}
