final class Television extends Electrodomestico{

	// Properties

	private int resolution = 20;

	private boolean TDT = false;



	// Constructors

	Television () {

		super();

	}

	Television (int preciobase, int peso) {

		super(preciobase,peso);

	}

	Television (int preciobase, int peso, String color, char consumo, int resolution, boolean TDT) {
	
		super(preciobase, peso, color, consumo);

		this.resolution = resolution;

		this.TDT = TDT;

	}



	// Methods

	public void precioFinal() {

		super.precioFinal();

		if (resolution>40) preciobase *= 1.3;

		if (TDT) preciobase += 50;

	}

	// Get methods

	public int resolutionGet() {

		return resolution;

	}

	public boolean TDTGet() {

		return TDT;

	}

}