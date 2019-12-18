public class ModAcceso {
	
	private int var1;										//Solo se accede desde esta clase
	
	private static final int constante1=4;					//Declaracion de una variable final que no se puede modificar
	
	public static void main (String[] args) {				//Se accede desde cualquier clase
		
		int var1=8;
		Prueba2 obj1=new Prueba2();
		Prueba2 obj2=new Prueba2();
		Prueba2.metodo1(7)
		obj1=obj2;
			if(obj1==obj2)
	}
	
	public static double random () {						//Declaracion de una clase con funcion random
		
			
	}
		
	protected static void metodo1 (String[] args) {			//Solo se accede desde clases del mismo paquete o una subclase de otro paquete
		
		int var1=8;
		Prueba2 obj1=new Prueba2();
		Prueba2 obj2=new Prueba2();
		obj1=obj2;
			if(obj1==obj2)
	}
}

