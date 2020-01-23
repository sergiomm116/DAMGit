public class Ejercicio31 {

	public static void main (String args[]) {

		// Crear e inicializar 3 variables Asignatura

		Asignatura asig1 = new Asignatura(1);

		Asignatura asig2 = new Asignatura(2);

		Asignatura asig3 = new Asignatura(3);



		// Alumno con las tres asignaturas

		Alumno alumno1 = new Alumno(asig1,asig2,asig3);



		// Crear Profesor y poner calificación a Alumno. Imprimir media.

		Profesor profesor1 = new Profesor();

		profesor1.ponerNotas(alumno1);

		System.out.println(alumno1.subj1Get().scoreGet());

		System.out.println(alumno1.subj2Get().scoreGet());

		System.out.println(alumno1.subj3Get().scoreGet());

		System.out.println("La media de este alumno es " + profesor1.calcularMedia(alumno1));

	}

}