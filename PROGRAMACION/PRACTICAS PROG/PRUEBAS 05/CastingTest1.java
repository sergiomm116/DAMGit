class Figura {
}

class Circulo extends Figura {
	double superficie(int radio){
		return Math.PI*radio*radio;
	}
}

class Cuadrado extends Figura {
}

public class CastingTest1 {
	public static void main (String[] args) {
		Circulo c1=new Circulo();
		Figura f1=c1;
		System.out.println((Circulo)f1.superficie(10));
	}
}

