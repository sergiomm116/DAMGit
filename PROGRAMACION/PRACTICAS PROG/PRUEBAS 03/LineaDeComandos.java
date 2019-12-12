//~ Ejecutar desde CMD y añadir parametros (java LineaDeComandos 1 2 3 4 5 6 7 8 9)
public class LineaDeComandos {
	
	public static void main (String[] args) {
		int i = args.length;
		if (args.length!=0) {
			for(String valor:args){
				System.out.println(valor);
			}
		}
	}
}
	 
