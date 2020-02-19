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
	final int x;//Constante "blanca", su valor se dar� en el Constructor
	TresF(int i){
		x=i;//x es ahora una constante con valor que ya no podr� ser cambiado
	}
}
class CuatroF{
	void mCuatroF(final int x){//El valor que reciba x, no podr� ser cambiado dentro del M�todo
		//x++;//Error
	}
}
class CincoF{
	final void mCincoF(){//Este M�todo no podr� ser reescrito en una clase Hija
		//C�digo del M�todo
	}
}
final class SeisF{//Esta clase no podr� tener descendencia
	//Propiedades y M�todos de la clase
}
public class FinalUsos{
	public static void main(String args[]){
		//Para hacer pruebas
	}
}
