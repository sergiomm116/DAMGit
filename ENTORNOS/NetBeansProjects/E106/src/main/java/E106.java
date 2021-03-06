	public class E106 {
		/**
		 * @author Sergio Martinez
		 * @version 1.0
		 **/
	static public void EAN (String codigo){
		System.out.print(codigo+" ");
		int dig = 0;
		
		if(codigo.length()==13){
			for(int i = 0; i < 12; i++){
				int num = Character.getNumericValue(codigo.charAt(i));
				if (i%2==0){
					dig = dig + num;
				}else{
					dig = dig + num*3;
				}
			}
			System.out.print(dig+" ");
			int last = Character.getNumericValue(codigo.charAt(12));
			if ((((dig+last)%10==0) || ((dig-last)%10==0)) && dig!=0){
				System.out.println(" SI");
			}else{
				System.out.println(" NO");
			}
				
			
		}else if(codigo.length()==8){
			for(int i = 0; i < 7; i++){
				int num = Character.getNumericValue(codigo.charAt(i));
				if (i%2!=0){
					dig = dig + num;
				}else{
					dig = dig + num*3;
				}
			}
			System.out.print(dig+" ");
			int last = Character.getNumericValue(codigo.charAt(7));
			if ((((dig+last)%10==0) || ((dig-last)%10==0)) && dig!=0){
				System.out.println(" SI");
			}else{
				System.out.println(" NO");
			}
			
		}else{
			System.out.println(" NO");
		}	
	}
	
	/*
	 * Metodo para identificar codigos de barras (tanto de 8 como de 13). Si es correcto imprime "SI", si no, "NO"
	 * @param Codigo String que contiene el codigo de barras a analizar
	 * @param dig Ecuacion necesario para verificacion de errores
	 * @param num Digito a analizar
	 * @param last Ultimo digito del codigo de barras con el que se verifican los errores
	 */
	public static void main (String[] args) {
		
		
		EAN("65839522");
		EAN("65839521");
		EAN("8414533043847");
		EAN("5029365779425");
		EAN("5129365779425");
		
	/*
	 * Clase ejecutable
	 * Llamada al metodo pasandole el como parametro String el codigo a analizar
	 */
		
	}
}

