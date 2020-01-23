class Asignatura {

	private int id;

	private double score;

	

	// Constructors

	Asignatura (int id) {

		this.id = id;

	}


	
	// Methods

	public int idGet() {

		return id;

	}

	public double scoreGet() {

		return score;

	}

	public void idSet(int id) {

		this.id = id;

	}

	public void scoreSet(double score) {

		this.score = score;

	}

}