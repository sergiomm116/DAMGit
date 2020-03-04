//Una Interface, puede "avisar" de que la clase que la implemente,
//debe tambien implementar otras Interfaces
interface Dos{
	//Propiedades y Metodos abstractos de la Interface Dos
	void mDos();
}
interface Tres{
	//Propiedades y Metodos abstractos de la Interface Tres
	void mTres();
}
interface Una extends Dos,Tres{//"Avisa" de la implementación obligatoria
								//de los Metodos de las Interfaces Dos y Tres,
								//en la clase donde se implemente la Interface Una
	void mUna();
}
class InterfaceTest7 implements Una{
	public void mUna(){
		//Escritura obligatoria del Metodo de la Interface Una
		InterfaceTest7 tu=new InterfaceTest7();
		Dos vd=tu;//Una variable de una Interface puede utilizarse para hacer referencia 
					//a objetos de la clase que implementa
	}
	public void mDos(){
		//Escritura obligatoria del Metodo de la Interface Dos
	}
	public void mTres(){
		//Escritura obligatoria del Metodo de la Interface Tres
		
	}
}
