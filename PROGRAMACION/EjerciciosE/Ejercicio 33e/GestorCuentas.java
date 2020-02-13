public class GestorCuentas {

	public static void main (String args[]) {

		// Initialization

		Corriente cuentacorriente = new Corriente(500);

		Ahorro cuentaahorro = new Ahorro(300);

		Twenty20 cuenta20 = new Twenty20(400);



		// Payments

		cuentacorriente.pay(300);

		System.out.println("En la cuenta corriente quedan: " + cuentacorriente.moneyGet());

		cuentacorriente.pay(300);	// Con este pago sabemos que cuentaahorro debe perder 100

		System.out.println("En la cuenta de ahorro quedan: " + cuentaahorro.moneyGet());

		cuenta20.pay(200);

		System.out.println("En la cuenta 2020 quedan: " + cuenta20.moneyGet());



		// Update interest

		System.out.print("El interes de la cuenta 2020 cambia de " + cuenta20.interestGet()*100 + "% ");

		cuenta20.interestSet(6);

		System.out.print("a " + cuenta20.interestGet()*100 + "%");



		// Add money to account20

		System.out.println("En la cuenta 2020 quedan: " + cuenta20.moneyGet() + "y se ingresarán 100 euros");

		cuenta20.addmoney(100);

		System.out.println("En la cuenta 2020 hay ahora: " + cuenta20.moneyGet());	

	}

}