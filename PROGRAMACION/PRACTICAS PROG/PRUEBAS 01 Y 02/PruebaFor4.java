public class PruebaFor4 {
	//~ Imprimir los numeros pares entre 1 y 100 separados por comas
	public static void main (String[] args) {
		for(int n=1;n<=100;n++)
			if(n%2==0){
				System.out.print(n+" ");
			}else{
				continue;
			}
			
	}
}
