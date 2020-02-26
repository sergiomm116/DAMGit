final class Lavadora extends Electrodomestico{

	// Properties

	private int carga = 5;



	// Constructors

	Lavadora () {
	
		super();
	
	}

	Lavadora (int preciobase, int peso) {

		super(preciobase, peso);

	}

	Lavadora (int preciobase, int peso, String color, char consumo, int carga) {

		super(preciobase, peso, color, consumo);

		this.carga = carga;

	}



	// Methods

	public void precioFinal() {

		super.precioFinal();

		if (carga>30) preciobase += 30;

	}

	public int cargaGet() {

		return carga;

	}

}