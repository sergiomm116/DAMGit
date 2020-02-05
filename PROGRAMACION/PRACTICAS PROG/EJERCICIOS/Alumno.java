public class Alumno {
	
		private String nombre;
		private String dni;
		private String matricula;
		private float nota;
		
		
		Alumno (String nombre, String dni, String matricula){
		this.nombre=nombre;
		this.dni=dni;
		this.matricula=matricula;
		}
		
		
		//~ Metodo Get para el nombre
		public String nombreGet (){
		return nombre;
		}
		
		//~ Metodo Get para el dni
		public String dniGet (){
		return dni;
		}
		
		//~ Metodo Get para la matricula
		public String matriculaGet (){
		return matricula;
		}
		
		//~ Metodo Get para la nota
		public float notaGet (){
		return nota;
		}
		
		//~ Metodo Set para la nota
		public void notaSet (float nota){
		this.nota=nota;
		}
		
		//~ Visualizacion de los datos
		public void datos(){
		System.out.println();
		System.out.println("------------------");
		System.out.println("Nombre: "+nombre);
		System.out.println("DNI: "+dni);
		System.out.println("Matricula: "+matricula);
		System.out.println("Nota: "+nota);
		System.out.println("------------------");
		}
		
}

