import java.util.Scanner;

public class Ejercicio6 {
	
	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
    	
    	
		System.out.println("Elige una de estas opciones introduciendo el numero correspondiente.");
		System.out.println("1. Area de rectangulo");
		System.out.println("2. Area de triangulo");
		System.out.println("3. Area de circulo");
		System.out.println("4. Salir");
		
		int o = input.nextInt();
		if (o<4 && o>0){
			switch (o) {
				case 1:
					System.out.println("Introduce la altura del rectangulo en centimetros.");
						double h = input.nextDouble();
					System.out.println("Introduce el ancho del rectangulo en centimetros.");
						double a = input.nextDouble();
					System.out.println("El area del rectangulo es "+String.format("%.2f",h*a)+" cm\u00b2.");
					break;
				case 2: 
					System.out.println("Introduce la altura del triangulo en centimetros.");
						double ht = input.nextDouble();
					System.out.println("Introduce la base del triangulo en centimetros.");
						double at = input.nextDouble();
					System.out.println("El area del triangulo es "+String.format("%.2f",ht*at/2)+" cm\u00b2.");
					break;
				case 3: 
					System.out.println("Introduce el radio del circulo en centimetros.");
						double r = input.nextDouble();
					System.out.println("El area del circulo es "+String.format("%.2f",r*r*Math.PI)+" cm\u00b2.");
				
			}		
		}
				System.out.println("_____________________________________________________________________");
				System.out.println(" ");
				System.out.println("Fin del programa");
	}
}

