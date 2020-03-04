//Una clase puede implementar mas de una Interface
//Solucionando de alguna forma la Herencia "multiple"
interface ArrancableG{
	int maxcil=2000;
	void arrancarG();
	void detenerG();
}
interface ArrancableD{
	int maxcil=1500;
	void arrancarD();
	void detenerD();
}
public class InterfaceTest4 implements ArrancableG,ArrancableD{//La clase que implementa Interfaces
																//esta obligada a definir todos los Metodos
																//de todas las Interfaces que implementa
	public static void main(String args[]){
	//Codigo del main()
	}
	public void arrancarG(){//Todos los Metodos implementados tienen que ser public
							//no se puede, al implementar, reducir la visibilidad del Metodo
		System.out.println("Arranca Gasolina");
	}
	public void arrancarD(){
		System.out.println("Arranca Diesel");
	}
	public void detenerG(){
			System.out.println("Detiene Gasolina");
	}
	public void detenerD(){
		System.out.println("Detener Diesel");
	}
}

