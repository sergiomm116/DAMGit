class Corriente extends CuentaBancaria {

	// Constructors

	Corriente (int money) {

		super(money);

	}



	// Methods

	public void pay (int payment, Ahorro cuentaahorro) {

		if (money>payment) {

			money -= payment;

		}

		else {

			if (cuentaahorro.money+money>payment) {

				System.out.println("Se descuenta lo que falta de la cuenta de ahorro...");

				int rest = (this.money-payment)*-1;

				cuentaahorro.money -= rest;

			}

			else {

				System.out.println("No puede realizar el pago. Saldo insuficiente");

			}

		}

	}

	public void pay (int payment) {

		if (money<payment) {

			System.out.println("No puede realizar el pago. Puede asociar una cuenta de ahorro e intentarlo de nuevo");

		}

		else {

			money -= payment;
	
		}		

	}

}