public class Ejercicio35 {
	
	public static void main (String[] args) {
		double numeros[] =  new double[6];
		
		for(int i = 0; i <=(numeros.length-1); i++){
			double aux = 0;
<<<<<<< HEAD
			aux = (Math.random()*99+1);
=======
			aux = (Math.random()*9+1);
>>>>>>> f6eecd5b01811161337bb1515d1419645f97299f
			numeros[i]= aux;
		}
		
		System.out.print("N\u00fameros: ");
		for (double i : numeros) {
			System.out.printf("%.2f"+" // ", i);
		}
		System.out.println();
		System.out.println();
		System.out.printf("M\u00e1ximo: %.2f"+"\n", Math2.maximo(numeros));
		System.out.printf("M\u00e1ximo2: %.2f"+"\n\n", Math2.maximo2(numeros));
		System.out.printf("M\u00ednimo: %.2f"+"\n", Math2.minimo(numeros));
		System.out.printf("M\u00ednimo2: %.2f"+"\n\n", Math2.minimo2(numeros));
		System.out.printf("Sumatorio: %.2f"+"\n\n", Math2.sumatorio(numeros));
		System.out.printf("Media: %.2f"+"\n", Math2.media(numeros));
		
	}
}
