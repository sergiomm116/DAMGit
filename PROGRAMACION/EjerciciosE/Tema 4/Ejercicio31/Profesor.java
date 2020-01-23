class Profesor {

	// Methods

	public void ponerNotas (Alumno alumno) {

		alumno.subj1Get().scoreSet(fixedrandom());

		alumno.subj2Get().scoreSet(fixedrandom());

		alumno.subj3Get().scoreSet(fixedrandom());

	}

	public double calcularMedia (Alumno alumno) {

		double sum = 0.0;

		sum += alumno.subj1Get().scoreGet();

		sum += alumno.subj2Get().scoreGet();

		sum += alumno.subj3Get().scoreGet();

		return sum/3;

	}

	public double fixedrandom() {

		double randy = Math.random()*10;

		return ((int)(randy*1000))/1000;

	}

}