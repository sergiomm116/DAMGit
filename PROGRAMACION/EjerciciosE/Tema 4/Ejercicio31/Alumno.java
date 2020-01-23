class Alumno {

	private Asignatura subj1;

	private Asignatura subj2;

	private Asignatura subj3;

	

	// Constructors

	Alumno (Asignatura subj1, Asignatura subj2, Asignatura subj3) {

		this.subj1 = subj1;

		this.subj2 = subj2;

		this.subj3 = subj3;

	}

	Alumno (int id1, int id2, int id3) {

		subj1 = new Asignatura(id1);

		subj2 = new Asignatura(id2);

		subj3 = new Asignatura(id3);

	}

	

	// Methods

	public Asignatura subj1Get() {
	
		return subj1;

	}

	public Asignatura subj2Get() {
	
		return subj2;

	}

	public Asignatura subj3Get() {
	
		return subj3;

	}

}