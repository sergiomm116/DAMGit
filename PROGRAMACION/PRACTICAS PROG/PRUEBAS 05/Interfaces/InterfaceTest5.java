//Veamos un ejemplo un poco mas completo
interface Constantes{
	double valorMaximo = 10000000.0;
	double valorMinimo = 0.0;
}
interface Variaciones{
	void asignaValor(double x);
	void rebaja(double t);
}
public class InterfaceTest5 implements Constantes,Variaciones{
	//Propiedades y Metodos propios de la clase
	private double totalSinIVA;
	public final static double IVA = 0.21;
	public double sinIVA(){
		return totalSinIVA;
	}
	public double conIVA(){
		return totalSinIVA*(1+IVA);
	}
	//Metodos que obligatoriamente hay que "escribir" de la Interface
	public void asignaValor(double x){
		if (valorMinimo<x)
			totalSinIVA=x;
		else
			totalSinIVA=0;//Si el valor es negativo
	}
	public void rebaja(double rb){
		totalSinIVA*=(1-rb/100);
	}
	//Metodo main()
	public static void main (String args[]){
		InterfaceTest5 f1=new InterfaceTest5();
		f1.asignaValor(250.0);
		System.out.printf("El precio sin IVA es: %.2f\n",f1.sinIVA());
		System.out.printf("El precio con IVA es: %.2f\n",f1.conIVA());
		System.out.println("Rebajado durante el mes de febrero un 20%");
		f1.rebaja(20);
		System.out.printf("Rebajado sin IVA es: %.2f\n",f1.sinIVA());
		System.out.printf("Rebajado con IVA es: %.2f\n",f1.conIVA());
	}
}
