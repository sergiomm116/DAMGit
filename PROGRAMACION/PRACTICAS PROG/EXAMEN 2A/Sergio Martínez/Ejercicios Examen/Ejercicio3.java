interface Puerta {
	public void abrir ();
	public void cerrar ();
}

interface PuertaBloqueable extends Puerta {
	public void bloquear ();
	public void desbloquear ();
}

class ComponentedeCoche {
	String descripcion;
	int peso, coste;
	
	public ComponentedeCoche (String descripcion, int peso, int coste){
		this.descripcion = descripcion;
		this.peso = peso;
		this.coste = coste;
	}
	
	public int getPeso() {
		return peso;
	}
	public int getCoste() {
		return coste;
	}
	public String getDescripcion() {
		return descripcion;
	}

}

class PuertaCoche extends ComponentedeCoche implements PuertaBloqueable{
	boolean estaBloqueada;
	

	public void bloquear(){
		System.out.println("Puerta abierta");
	}
	public void desbloquear(){
		System.out.println("Puerta abierta");
	}

}

public class Ejercicio3 {
	
	
}

