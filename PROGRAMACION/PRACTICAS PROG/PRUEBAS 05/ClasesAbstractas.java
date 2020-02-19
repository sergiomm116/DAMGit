abstract class Vehiculo{
	public int velocidad=0;
	abstract public void acelera();//Cabecera (firma) de Metodo abstracto
	public void para(){
		velocidad=0;
	}															//CUANDO TENEMOS UN METODO ABSTRACTO OBLIGATORIAMENTE LA CLASE DEBE DE SER ABSTRACTO
}
class Coche extends Vehiculo{
	public void acelera(){//Obligatoriamente hay que escribir su codigo               // SI LA CLASE HIJA ES ABSTRACTA NO ES NECESARIO ESCRIBIR EL METODO, PARA
																					  //POSTERIOR MENTE HACERLO EN UNA CLASE NIETA
		velocidad+=5;
	}
}
public class ClasesAbstractas {
	public static void main(String args[]) {
		Coche c1=new Coche();
		c1.acelera();
		System.out.println(c1.velocidad);//Escribe 5
		c1.para();
		System.out.println(c1.velocidad);//Escribe 0
	}
}
