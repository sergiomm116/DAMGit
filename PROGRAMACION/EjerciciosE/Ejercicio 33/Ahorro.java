class Ahorro extends CuentaBancaria {

	// Variables

	protected double interest;



	// Constructors

	Ahorro (int money) {

		super(money);

		interest = 0.04;

	}



	// Methods

	public void applyinterest () {

		money += (int) (money*interest);

	}

}