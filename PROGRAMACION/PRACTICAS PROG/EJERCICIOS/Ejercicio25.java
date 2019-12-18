//~ Crear una clase que nos genere aleatoriamente una tabla de 5 por 5 conteniendo
//~ los resultados (entre 0 y 5) de todos los enfrentamientos entre cinco equipos deportivos
//~ Clasificar a los equipos en funcion de los resultados (partido ganado: 3, partido empatado: 1, partido perdido: 0)



public class Ejercicio25 {
	
	public static void main (String[] args) {
		
		int[] columna = {0,1,2,3,4};
		int[] fila = {0,1,2,3,4};
		
		int[] equipoA = new int [8];
		int[] equipoB = new int [8];
		int[] equipoC = new int [8];
		int[] equipoD = new int [8];
		int[] equipoE = new int [8];
		
		int contA = 0;
		int contB = 0;
		int contC = 0;
		int contD = 0;
		int contE = 0;
		
		int resultado=0;
		
		for(int i=0;i<=3;i++){
			resultado = (int)(Math.random()*7-1);
			equipoA[i]=resultado;
		}
		for(int i=0;i<=3;i++){
			resultado = (int)(Math.random()*7-1);
			equipoB[i]=resultado;
		}
		for(int i=0;i<=3;i++){
			resultado = (int)(Math.random()*7-1);
			equipoC[i]=resultado;
		}
		for(int i=0;i<=3;i++){
			resultado = (int)(Math.random()*7-1);
			equipoD[i]=resultado;
		}
		for(int i=0;i<=3;i++){
			resultado = (int)(Math.random()*7-1);
			equipoE[i]=resultado;
		}
		
			if(equipoA[0]>equipoB[0]){
				contA+= 3;
			}
			if(equipoA[0]<equipoB[0]){
				contB+= 3;
			}
			if(equipoA[0]==equipoB[0]){
				contA+= 1;
				contB+= 1;
			}
			
			if(equipoA[0]>equipoC[0]){
				contA+= 3;
			}
			if(equipoA[0]<equipoC[0]){
				contC+= 3;
			}
			if(equipoA[0]==equipoC[0]){
				contA+= 1;
				contC+= 1;
			}
			
			if(equipoA[0]>equipoD[0]){
				contA+= 3;
			}
			if(equipoA[0]<equipoD[0]){
				contD+= 3;
			}
			if(equipoA[0]==equipoD[0]){
				contA+= 1;
				contD+= 1;
			}
			
			if(equipoA[0]>equipoE[0]){
				contA+= 3;
			}
			if(equipoA[0]<equipoE[0]){
				contE+= 3;
			}
			if(equipoA[0]==equipoE[0]){
				contA+= 1;
				contE+= 1;
			}
			
			System.out.println(contA);
		
		
		//~ System.out.println("---------------------");
		//~ for(int i=0;i<=4;i++){
			//~ for(int j=0;j<=4;j++){
				//~ celda= fila[i]+columna[j];
				//~ System.out.print("| "+celda+" ");
			//~ }
			//~ System.out.print("|");
			//~ System.out.println("\n---------------------");
		//~ }
	}
}

