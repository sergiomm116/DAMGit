class Vehiculo {
	
		protected String matricula;
		protected int caballos;
		
		protected void parar() {
			System.out.println("Parar!");
		}
		
		protected void arrancar() {
			System.out.println("Arrancar!");
		}
}


class Taxi extends Vehiculo {
	
		int licencia;
		
		public void cobrar() {
			System.out.println("Cobrar!");
		}
}

public class Test1{
	public static void main (String args []){
		Taxi t1=new Taxi();
		t1.arrancar();
		t1.cobrar();
	}
}

