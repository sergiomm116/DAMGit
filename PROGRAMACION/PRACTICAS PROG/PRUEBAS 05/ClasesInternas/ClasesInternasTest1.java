//1.- Clases internas regulares
class Contenedora1{//Clase Contenedora o global
	//Propiedades y Metodos de la clase Contenedora
	class Interna1{//Clase interna, se crea un archivo class: ClaseContenedora$ClaseInterna.class
				   //En nuestro caso Contenedora1$Interna1.class
				   //Las clases internas pueden ser private, protected o public
				   //No se puede definir ningun elemento static dentro de ellas
				   //logicamente, main() tampoco
		void mInterno(){
			System.out.println("Clase Interna");
		}
	}
}
