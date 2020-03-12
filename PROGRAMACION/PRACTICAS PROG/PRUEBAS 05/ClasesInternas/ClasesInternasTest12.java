//5.- Clases internas estaticas
//... y ademas, en este caso si pueden tener Propiedades y Metodos estaticos
//... lo que permitiria, por ejemplo, crear Interfaces con Metodos desarrollados
interface Contenedora12{
	void nohacenada();
	public static class Interna12{
		static int a;
		void mInterno(){//Metodo desarrollado dentro de la Interface Contenedora12
			System.out.println("Estoy dentro de una Interface");
		}
	}
}
public class ClasesInternasTest12 implements Contenedora12{
	public static void main(String args[]){
		ClasesInternasTest12 cc1=new ClasesInternasTest12();
		cc1.nohacenada();
		Contenedora12.Interna12 ci=new Contenedora12.Interna12();
		ci.mInterno();//Llamada a Metodo implementado dentro de la Interface
	}
		public void nohacenada(){//Metodo obligatorio de implementar
			System.out.println("No hace nada");
		}	
}
