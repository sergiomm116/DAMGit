import java.util.Scanner;
public class Ejercicio26 {
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Introduce el primer entero: ");
		int v1 = input.nextInt();
		System.out.print("Introduce el segundo entero: ");
		int v2 = input.nextInt();
		
		suma (v1,v2);
		
		if(v1>v2){
			int aux=v1;
			v1=v2;
			v2=aux;
		}
	}
	static int suma (int s1, int s2){
		if (s1==s2){
			return s1;
		}else{
		return s1+suma(s1+1,s2);
		}
	}
}

