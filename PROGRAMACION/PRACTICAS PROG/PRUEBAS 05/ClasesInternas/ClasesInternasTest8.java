//4.- Clases internas anonimas
//Sirven para crear objetos "sobre la marcha", sin nombre
class Contenedora8{
	int valor;
	Contenedora8(){
		valor=0;
	}
	Contenedora8(int valor){
		this.valor=valor;
		if (valor==1){
			new Contenedora8(){//Aqui se crea el objeto de la clase ...
								//... y comienza la definicion de la clase anonima ...
				void mInterno(){
					System.out.println("Clase Interna a un bloque");
				}
			}.mInterno();//... utilizada para ejecutar el Metodo mInterno()
			//Este "objeto", logicamente, deja de estar accesible a partir de aqui
		}else{
			System.out.println("El valor pasado NO es 1");
		}
	}
}
public class ClasesInternasTest8{
	public static void main(String args[]){
		Contenedora8 ci1=new Contenedora8(1);
	}
}
