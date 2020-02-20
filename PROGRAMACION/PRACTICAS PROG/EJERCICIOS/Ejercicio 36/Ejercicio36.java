class Electrodomestico {
	
	protected int precio;
	protected String color;
	protected char consumo;
	protected int peso;
	
	
	public String colorGet(){
      return color;
	}
	
	public char consumoGet(){
      return consumo;
	}
	
	public int precioGet(){
      return precio;
	}
	public int pesoGet(){
      return peso;
	}
	
	
	
	
}
class Lavadora extends Electrodomestico {
	protected int carga;

}

class Television extends Electrodomestico {
	protected int pulgadas;
	protected boolean tdt;
	
	public int pulgadasGet(){
      return pulgadas;
	}
	
	public boolean tdtGet(){
      return tdt;
	}
	
}

public class Ejercicio36 {
	
	public static void main (String[] args) {
		
		Electrodomestico aparato[] =  new Electrodomestico[10];
		
		//~ for(int i = 0; i <=(aparato.length-1); i++){
			//~ int tipo = (int)(Math.random()*2+1);
				
				//~ switch(tipo) {
					//~ case 1:
						//~ aparato[i]="Lavadora";
						//~ break;
					//~ case 2:
						//~ aparato[i]="Television";
						//~ break;
				//~ }
		//~ }
		
		//~ System.out.println("Electrodomesticos: ");
		//~ for (String i : aparato) {
			//~ System.out.println(i);
		//~ }
		
	}
}

