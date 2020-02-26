class Electrodomestico {

	// Properties

	protected int preciobase;

	protected int peso;

	protected String color;

	protected char consumo;

	final String[] colorsch = {"BLANCO", "ROJO", "AZUL", "NEGRO", "GRIS"};


	// Constructors

	Electrodomestico() {

		preciobase = 100;

		color = "BLANCO";

		consumo = 'F';

		peso = 5;

	}

	Electrodomestico (int preciobase, int peso) {

		this();

		this.preciobase = preciobase;

		this.peso = peso;

	}

	Electrodomestico (int preciobase, int peso, String color, char consumo) {

		this(preciobase, peso);

		comprobarConsumoEnergetico(consumo);

		comprobarColor(color);

	}


	// Methods

	public void precioFinal() {

		// Add based on consumo

		switch (consumo) {

			case 65: preciobase += 100; break;

			case 66: preciobase += 80; break;

			case 67: preciobase += 60; break;

			case 68: preciobase += 50; break;

			case 69: preciobase += 30; break;
 
			case 70: preciobase += 10; break;

		}

		// Add based on weight

		if (peso <= 19) {

			preciobase += 10;

		}

		else if (peso > 19 && peso <= 49) {

			preciobase += 50;

		}

		else if (peso > 49 && peso <= 79) {

			preciobase += 80;

		}

		else {

			preciobase += 100;

		}

	}

	public void comprobarConsumoEnergetico (char consumo) {

		if (consumo>=65 && consumo<=70) {

			this.consumo = consumo;

		}

		else if (consumo>=97 && consumo<=102) {

			this.consumo = (char) (consumo-32);

		}

	}

	public void comprobarColor (String color) {

		color = color.toUpperCase();

		boolean inside = false;

		for (String test : colorsch) {

			if (test.equals(color)) inside = true;

		}

		if (inside) this.color = color;

	}

	// Getting methods

	public int preciobaseGet() {

		return preciobase;

	}

	public int pesoGet() {

		return peso;

	}

	public String colorGet() {

		return color;

	}

	public char consumoGet() {

		return consumo;

	}

}