abstract class OrdenadorIncompleto implements Ordenador{
	public int getFrecuenciaMicro(){
		return 	3700;
	}
	public abstract int getTamanoDisco();
	public abstract int getMemoria();
	public abstract void mostrarCaracteristicas(int numCaracteristica);
	
}
