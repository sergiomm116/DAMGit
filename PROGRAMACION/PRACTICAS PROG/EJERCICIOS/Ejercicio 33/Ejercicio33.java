class CuentaBancaria{
	
	protected double saldo;
	
	CuentaBancaria(double saldo){
		this.saldo = saldo;
	
	}
	
	public void ingresar (double ingreso) {

		saldo += ingreso;

		System.out.println("Se ingresaron " + ingreso + " euros");

	}

	public double saldoGet() {

		return saldo;

	}
}
