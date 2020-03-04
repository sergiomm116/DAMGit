public class Ejercicio37{

	public static void main (String[] args) {
		
		//~ Ordenador[] catalogo = new Ordenador[5];
		//~ catalogo[0]=new OrdenadorPortatil();
		//~ catalogo[1]=new OrdenadorPortatil();
		//~ catalogo[2]=new OrdenadorPortatil();
		//~ catalogo[3]=new OrdenadorPersonal();
		//~ catalogo[4]=new OrdenadorPersonal();
		
		
	}
}

abstract class OrdenadorIncompleto implements Ordenador{
	public int getFrecuenciaMicro(){
		return 	3700;
	}
	public abstract int getTamanoDisco();
	public abstract int getMemoria();
	abstract void mostrarCaracteristicas();
	
}

class OrdenadorPersonal extends OrdenadorIncompleto {
	public void mostrarCaracteristicas(){
		int pulgadas = 27;
	}
	
}



