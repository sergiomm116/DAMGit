public class Ejercicio3 {
	
	public static void main (String[] args) {
		String posiciones[];
		posiciones = new String[10];
		String vocales[];
		vocales = new String[] {"","a","e","i","o","u"};
		String letra;
		
		for (int i=0;i<=9;i++){
			int n = (int)((Math.random())*5+1);
			posiciones[i]=vocales[n];
			System.out.print(posiciones[i]+",");
		}
		
			
	}
}

