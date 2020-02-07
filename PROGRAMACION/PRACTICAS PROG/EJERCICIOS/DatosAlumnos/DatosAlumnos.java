import java.util.Scanner;
public class DatosAlumnos {

	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		Alumno alumnos[]=new Alumno[2];
		
		alumnos[0]= new Alumno("Sergio","04626490Z","00001");
		alumnos[1]= new Alumno("Daniel","04739672X","00002");
		

		float notaAux;
		
		for (int i=0; i<2;i++){
			System.out.println("Introduzca la nota de "+alumnos[i].nombreGet()+" con DNI "+alumnos[i].dniGet()+" con matricula "+alumnos[i].matriculaGet()+" de 0 a 10");
			
			while(true){
				notaAux = input.nextFloat();
				if(notaAux >= 0 && notaAux <= 10 ){
					alumnos[i].notaSet(notaAux);
					break;
				}
			}
		}
	
				
		System.out.printf("\n\nDatos de los alumnos");
			
		for (int i=0; i<2;i++){
		alumnos[i].datos();
		}
    
	}
}

