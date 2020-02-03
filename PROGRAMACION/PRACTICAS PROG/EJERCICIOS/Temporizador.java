
public class Temporizador {

	private String nombre;
	private int segundos;
		
		
	Temporizador (String nombre, int segundos){
		this.nombre=nombre;
		this.segundos=segundos;
	}
	
	//~ Metodo Get para el nombre
	//~ public String nombreGet (){
		//~ return nombre;
	//~ }
	
	//~ Metodo Get para los segundos
	//~ public int segundosGet (){
		//~ return segundos;
	//~ }
	
	//~ Metodo Set para los segundos
	//~ public void segundosSet (int segundos){
		//~ this.segundos=segundos;
	//~ }
	
	//~ Metodo Set para el nombre
	//~ public void nombreSet (String nombre){
		//~ this.nombre=nombre;
	//~ }
	
	public void cuenta() throws InterruptedException{
		System.out.println("Inicio del temporizador "+nombre+" de "+segundos+" segundos.");
		
		for (int cuenta=segundos; cuenta>=0 ; cuenta--){
			Thread.sleep(1000);
			System.out.printf("%02d\b\b", cuenta);
		}
		
		System.out.println();
		System.out.println("Fin del temporizador");
	}
		
	
	
}

