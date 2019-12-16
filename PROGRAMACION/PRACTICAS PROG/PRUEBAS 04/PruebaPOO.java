public class PruebaPOO {
	
	int v1;
	
	public static void main (String[] args) {
		int v1=8;
		int v3=4;
		
		System.out.println("main v1: "+v1);
		System.out.println("main v3: "+v3);
		
		PruebaPOO obj1=new PruebaPOO();
		PruebaPOO obj2=new PruebaPOO();
		
		if(obj1==obj2){
			System.out.println("Son iguales");
		}else{
			System.out.println("No son iguales");
		}
	}
	
	public void nombreMetodo(int v1, long v2, int v3){			//void: No devuelve valor ; return: Devuelve valor
		
		System.out.println("metodo v1: "+v1);
		System.out.println("metodo v3: "+v3);
	}
}

