
class Helado {
	protected String azucar;
	protected String burgerking;
	
	public Helado(String azucar, String burgerking){
		this.azucar=azucar;
		this.burgerking=burgerking;
	} 
	
	public String azucarGet(){
		return azucar;
	}
	
	public String burgerkingGet(){
		return burgerking;
	}
}

class DulceDeLeche extends Helado {
	protected String canela;
	protected String caramelo;
	
	public String canelaGet(){
		return canela;
	}
	public String carameloGet(){
		return caramelo;
	}
	public DulceDeLeche (String azucar, String burgerking, String canela, String caramelo){
		super(azucar, burgerking);
		this.canela=canela;
		this.caramelo=caramelo;
		
	}
}
class StrawberryCheesecake extends Helado{
	protected String frambuesa;
	protected String queso;
	
	public String frambuesaGet(){
		return frambuesa;
	}
	public String quesoGet(){
		return queso;
	}
	
	public StrawberryCheesecake(String azucar, String burgerking, String frambuesa, String queso){
		super(azucar, burgerking);
		this.frambuesa=frambuesa;
		this.queso=queso;
	}
}



public class Capullos {
	
	public static void main (String[] args) {
		DulceDeLeche muchoporfi= new DulceDeLeche("Demasiado","7","bien rica","fuera");
		System.out.println(muchoporfi.azucarGet());
		System.out.println(muchoporfi.burgerkingGet());
		System.out.println(muchoporfi.canelaGet());
		System.out.println(muchoporfi.carameloGet());
		
		StrawberryCheesecake parasergio=new StrawberryCheesecake("No, gracias","Gracias por el regalo","Que delicia","Que es eso?");
		System.out.println(parasergio.azucarGet());
		System.out.println(parasergio.burgerkingGet());
		System.out.println(parasergio.frambuesaGet());
		System.out.println(parasergio.quesoGet());
	}
}

