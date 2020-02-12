class CuentaBancaria {

	// Variables

	protected int money;



	// Constructors

	CuentaBancaria(int money) {

		this.money = money;
	
	}



	// Methods

	public void addmoney (int adding) {

		money += adding;

		System.out.println("Se ingresaron " + adding + " euros");

	}

	public int moneyGet() {

		return money;

	}

}