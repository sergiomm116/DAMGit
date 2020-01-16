import java.util.*;

public class Ejercicio30 {
	
	static String nombremo;
	static int saldoi;
	static Monedero monederos[]=new Monedero[0];
	static int indice;
	
	Scanner teclado = new Scanner (System.in);
	
	
	public static void main (String[] args) {
		char opcion=0;
		
		while (opcion!=50)
			System.out.pritln("1. Crear monedero.");
			System.out.pritln("2. Sacar dinero.");
			System.out.pritln("3. Ingresar dinero.");
			System.out.pritln("4. Consultar saldo.");
			System.out.pritln("5. Fin.");
			opcion=teclado.nextLine().charAt(0);
			switch (opcion){
				case 49:
						preguntarNombre();
						if(!existeMonedero(nombremo)){
							nuevoMonedero();
							preguntarDinero();
							monederos[indice++]=new Monedero(nombremo,saldoi);
						}
						else 
							System.out.println("*****El monedero ya existe*****");
						break;
				
				case 50:
						monederosDisponibles();
						preguntarNombre();
						if (!existeMonedero(nombremo)){
							preguntarDinero();
							for(int i=0;i<monederos.length;i++)
								if(monederos[i]!=null)
									if(monederos[i].nombremGet().equals(nombremo))
									monederos[i].reintegro(saldoi);
						}
						else 
							System.out.println("*****El monedero no existe*****");
						break;
						
						
				case 51:
						monederosDisponibles();
						preguntarNombre();
						if (!existeMonedero(nombremo)){
							preguntarDinero();
							for(int i=0;i<monederos.length;i++)
								if(monederos[i]!=null)
									if(monederos[i].nombremGet().equals(nombremo))
									monederos[i].reintegro(saldoi);
						}
						else 
							System.out.println("*****El monedero no existe*****");
						break;
							
							
							
	static boolean existeMondero(String nombremo){
		for(Monedero monedero:monederos){
			
							
		}
	}
	
	static void monederosDisponibles(){
		System.out.println("");
	
	}
	static void nuevoMondero(){
		monederos=Arrays.copyOf(monederos, monederos.length+1);
	}
	static void preguntarNombre(){
		System.out.print("Nombre de monedero: ");
		nombremo=teclado.nextLine();
	}
	static void preguntarDinero(){
		System.out.print("Dinero: ");
		saldoi=Integer.parseint.(teclado.nextLine());
	}
}

