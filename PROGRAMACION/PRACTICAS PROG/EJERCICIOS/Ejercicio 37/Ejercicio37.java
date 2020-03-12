public class Ejercicio37{

	public static void main (String[] args) {
		
		Ordenador[] catalogo = new Ordenador[5];
		catalogo[0]=new OrdenadorPortatil();
		catalogo[1]=new OrdenadorPortatil();
		catalogo[2]=new OrdenadorPortatil();
		catalogo[3]=new OrdenadorPersonal();
		catalogo[4]=new OrdenadorPersonal();
		
		mostrarCatalogo(catalogo);
		
	}
	
	static public void mostrarCatalogo(Ordenador[] catalogo){
		for(int i = 0; i<=4 ; i++){
			System.out.println("Almacenamiento: "+catalogo[i].getTamanoDisco());
			System.out.println("Frecuencia CPU: "+catalogo[i].getFrecuenciaMicro());
			System.out.println("Memoria RAM: "+catalogo[i].getMemoria());
			System.out.println("Caracteristica: "+catalogo[i].getMemoria());
			System.out.println();
		}
	}
}






