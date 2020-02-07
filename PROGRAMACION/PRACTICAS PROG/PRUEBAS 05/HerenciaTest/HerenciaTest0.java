//Ejemplo genérico de clase Hija que amplia la funcionalidad de una clase
//Madre
class Vehiculo {
	public int velocidad;
	public int ruedas;
	public void parar() {
		velocidad = 0;
	}
	public void acelerar(int kmh) {
		velocidad += kmh;
		System.out.println(velocidad);
	}
}
class Coche extends Vehiculo {
	public int ruedas=4;
	public int gasolina;
	public void repostar(int litros) {
		gasolina+=litros;
		System.out.println(gasolina);
	}
}
public class HerenciaTest0 {
	public static void main(String[] args) {
		Coche coche1=new Coche();
		coche1.acelerar(80);//Metodo heredado
		coche1.repostar(12);//Método no heredado
	}
}

