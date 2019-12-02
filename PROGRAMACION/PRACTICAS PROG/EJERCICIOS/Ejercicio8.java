//8. Crear una clase que permita adivinar un numero entre 1 y 20 generado al azar, 
//tras cada intento fallido debe pedir un nuevo intento aportando como pista si 
//es mayor o menor, cuando se acierte el numero mostrara el mensaje: Correcto en X intentos
import java.util.Scanner;
public class Ejercicio8 {
//Generamos un numero al azar, creamos una variable donde introducir nuestros intentos y un contador.
	public static void main (String[] args) {
		int a= (int) (Math.random()*20+1);
		int contador=0;
		int x=-1;
		Scanner input=new Scanner(System.in);
//Utilizamos while para que si nuestro numero no es correcto nos siga pididendo que lo acertemos.
		while (a!=x) {
			System.out.print("Adivina un numero del 1 al 20: ");
			x = input.nextInt();
			contador++;
//Si el numero no es correct nos dara una pista de si es mayor o menor.
				if (a!=x){
					if (a>x){
						System.out.println("El numero a adivinas es mayor.");
					}else{
						System.out.println("El numero a adivinar es menor.");
					}
				}
		}
//Una vez acertado, sacara la variable contador que ha ido acumulando durante todos los intentos.
		System.out.println("Correcto en "+contador+" intentos.");
	}
}

