class UnoF{
	final int x=9;//Constante creada en tiempo de compilacion
	final int y=(int)Math.random()*10+1;//Constante en tiempo de ejecucion
	void mUnoF(){
		System.out.println("Valor de x: "+x+", valor de y: "+y);
	}
}
class DosF{
	int x=0;
	void mDosF(){
		final DosF obj1=new DosF();//obj1 ya no puede apuntar a otro objeto
		obj1.x=5;//Pero los elementos a los que apunta si pueden cambiar de valor
	}
}
class TresF{
	final int x;//Constante "blanca", su valor se dará en el Constructor
	TresF(int i){
		x=i;//x es ahora una constante con valor que ya no podrá ser cambiado
	}
}
class CuatroF{
	void mCuatroF(final int x){//El valor que reciba x, no podrá ser cambiado dentro del Método
		//x++;//Error
	}
}
class CincoF{
	final void mCincoF(){//Este Método no podrá ser reescrito en una clase Hija
		//Código del Método
	}
}
final class SeisF{//Esta clase no podrá tener descendencia
	//Propiedades y Métodos de la clase
}
public class FinalUsos{
	public static void main(String args[]){
		//Para hacer pruebas
	}
}
