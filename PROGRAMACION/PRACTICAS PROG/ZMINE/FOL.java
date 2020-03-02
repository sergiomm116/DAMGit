import java.util.Scanner;
public class FOL {
	
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		boolean puerta = false;
		
		while(puerta==false){
		
			int cod = input.nextInt();
			
			switch (cod){
				case 54538:
				
					System.out.println();
					System.out.println("LUCES DEBLOQUEADAS");
					System.out.println();
					break;
				
				case 242589:
				
					System.out.println();
					System.out.println("PANTALLA PROYECTOR DESBLOQUEADA");
					System.out.println();
					break;
				case 12151720:
				
					System.out.println();
					System.out.println("ARMARIO DESBLOQUEADO");
					System.out.println();
					break;
					
				case 26158492:
				
					puerta = true;
					break;
					
				default:
					System.out.println();
					System.out.println("CODIGO ERRONEO");
					System.out.println();
			}
		}
		
		System.out.println();
		System.out.println("PUERTA ABIERTA, PODEIS ESCAPAR!");
	}
}

