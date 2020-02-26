public class Ejercicio36 {

	public static void main (String args[]) {

		// Initial variables

		double cat;

		Electrodomestico[] elec1 = new Electrodomestico[10];

		final String[] colorsch = {"BLANCO", "ROJO", "AZUL", "NEGRO", "GRIS"};

		boolean TDT = false;


		// Generate array

		for (int i=0; i<10; i++) {

			cat = Math.random();

			if (cat>0.5) {

				if (cat>0.75) TDT = true;

				elec1[i] = new Lavadora((int) (Math.random()*10+1)*100, ((int) (Math.random()*10+1))*10, colorsch[(int) (Math.random()*5)], (char) (Math.random()*6+65), ((int) (Math.random()*10+1))*10);

			}

			else {

				elec1[i] = new Television((int) (Math.random()*10+1)*100, ((int) (Math.random()*10+1))*10, colorsch[(int) (Math.random()*5)], (char) (Math.random()*6+65), ((int) (Math.random()*10+1))*10, TDT);

			}

		}



		// Execute precioFinal();

		int[] preciosfinales = new int[10];

		int sum = 0;

		for (int i=0; i<10; i++) {

			elec1[i].precioFinal();

			preciosfinales[i] = elec1[i].preciobaseGet();

			if (elec1[1] instanceof Lavadora) {

				System.out.println("Precio de lavadora en la posicion " + i + " : " + preciosfinales[i]);

			}

			else {

				System.out.println("Precio de TV en la posicion " + i + " : " + preciosfinales[i]);

			}

			sum += preciosfinales[i];

		}

		System.out.println("El precio total es: " + sum);

	}

}