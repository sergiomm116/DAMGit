//Una Interface define el comportamiento de una o varias clases,
//precisamente por esto, se les suele nominar como "Nombreable"
//En una Interface, la palabra class se sustituye por interface
interface Arrancable{//Si incluye el modificador public, el fichero debe llamarse NombreInterface.java
	public static final int maxcil=5000;
	public abstract void arrancar();
	public abstract void detener();
}
interface Arrancable2{
	int maxcil=5000;//Se puede omitir public static final y debe inicializarse
	void arrancar();//Todos los Metodos son publicos y abstractos
	void detener();//por tanto, no hay obligacion de incluir public abstract
}

