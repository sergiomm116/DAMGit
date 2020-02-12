class Twenty20 extends CuentaBancaria{

	// Variables

	private double interest;

	private double penalty;

	

	// Constructor

	Twenty20 (int money) {

		super(money);

		interest = 0.08;

		penalty = 0.02; 

	}



	// Methods

	public void applyinterest () {

		money += (int) (money*interest);

	}

	public void pay (int payment) {

		money -= (int) payment*(1+penalty);

	}

	public void interestSet(int interest) {

		this.interest = (double) interest/100;

	}

	public double interestGet() {

		return interest;

	}

}