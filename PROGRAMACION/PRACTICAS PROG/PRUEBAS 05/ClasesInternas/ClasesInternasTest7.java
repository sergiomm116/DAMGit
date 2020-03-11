//3.- Clases internas dentro de un Bloque
//Se declaran dentro de un Bloque concreto,
//por ejemplo, dentro de un if del Constructor
class Contenedora7{
	int valor;
	Contenedora7(int valor){
		this.valor=valor;
		if (valor==1){
			class Interna7{//Clase interna al bloque if
				void mInterno(){
					System.out.println("Clase Interna a un bloque");
				}
			}
			Interna7 ci7=new Interna7();//Unicamente dentro del bloque if
										//podriamos crear instancias de ella
			ci7.mInterno();
		}else{
			System.out.println("El valor pasado NO es 1");
		}
//		Interna7 ci7=new Interna7();//Error, aqui la clase ya no existe
	}
}
public class ClasesInternasTest7{
	public static void main(String args[]){
		Contenedora7 ci1=new Contenedora7(7);
	}
}
