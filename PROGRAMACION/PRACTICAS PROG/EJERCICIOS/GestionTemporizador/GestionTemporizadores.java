


public class GestionTemporizadores {
	
	public static void main (String[] args) throws InterruptedException{
		
		Temporizador t1= new Temporizador("T1",20);
		Temporizador t2= new Temporizador("T2",30);
		
		
		//~ Cambiar segundos de T1
		//~ t1.segundosSet(15);
		
		//~ Cambiar nombre de T2
		//~ t2.nombreSet("Temp2");
		
		//~ Nombre de T2
		System.out.println(t2.nombreGet());
		
		//~ Segundos de T1
		//~ System.out.println(t1.segundosGet());
		
		//~ Ejecucion del metodo cuenta
		//~ t1.cuenta();
		
		
		
	}
}

