public class Cuentas {
	
	protected double saldo;
	protected double ingreso;
	protected double retirada;
	protected double interes;
	protected double resul;
	
	protected void Saldo (double saldo) {
		this.saldo = saldo;
	}
	protected void Ingresar (double saldo, double ingreso) {
		saldo = saldo + ingreso;
	}
	
	protected void Retirar (double saldo, double retirada) {
		saldo = saldo - retirada;
	}
	
	protected void Intereses (double saldo, double interes) {
		saldo = saldo + (saldo * interes);
	}
	
	
 
}
