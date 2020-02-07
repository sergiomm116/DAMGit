import java.util.Scanner;

class Cuentas {
	
	protected String nombre;
	protected int saldo;
	protected int retirada;
	protected int ingreso;
	
	
	protected void retirar(){
		saldo-=retirada;
	}
		
	protected void ingresar(){
		saldo+=ingreso;
	}
}
	
class Corriente extends Cuentas{

}
class Ahorro extends Cuentas{
	
}
class L_2020 extends Cuentas{

}


public class Ejercicio33{
	
	public static void main (String[] args) {
		
	}
}

