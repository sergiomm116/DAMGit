class Persona implements Comparable<Persona> {

	private String nombre;

	private int edad;

	private int altura;

	Persona (String nombre, int edad, int altura) {

		this.nombre = nombre;

		this.edad = edad;

		this.altura = altura;

	}

	public int compareTo(Persona entrada) {

		double edadcomparar = (double) this.edad/entrada.edad;

		double alturacomparar = (double) this.altura/entrada.altura;

		double resultado = edadcomparar*alturacomparar;

		if (resultado > 1) {
		
			return 1;

		}

		else if (resultado < 1) {

			return -1;

		}

		else if (resultado == 1) {

			return 0;

		}

		return -256;			// Should be unreachable

	}

}
