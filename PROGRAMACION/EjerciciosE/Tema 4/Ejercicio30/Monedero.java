class Monedero {

	private String nombre;

	private int saldo;

	Monedero(String nombre, int saldo) {

		this.nombre = nombre;

		this.saldo = saldo;

		System.out.println("Creado nuevo monedero de nombre " + nombre + " con un saldo de " + saldo);

	}

	public String toString() {

		return "  " + nombre + "\t\t " + saldo + "     ";

	}

	public void substract(int payment) {

		if (payment <= this.saldo) {

			saldo -= payment;

			System.out.println("Saldo restante en la cuenta: " + saldo);

		}

		else {

			System.out.println("!-Error: Saldo insuficiente en este monedero-!");

		}
	
	}

	public void adding(int input) {

		saldo += input;

		System.out.println("Nuevo saldo: " + saldo);

	
	}

	public String nombreGet() {

		return nombre;

	}

}