//Las clases implementan la Interface FiguraGeometrica
//indicando "Como hacerlo"
class Cuadrado implements FiguraGeometrica{
	private double lado;
	public Cuadrado(double lado){
		this.lado = lado;
	}
	public double superficie(){
		return lado*lado;
	}
}
class Circulo implements FiguraGeometrica{
	private double radio;
	public Circulo(double radio){
		this.radio=radio;
	}
	public double superficie(){
		return PI*radio*radio;
	}
}
//Clase para testear la Interface
public class InterfaceTest6{
    public static void main(String args[]){
		FiguraGeometrica f=new FiguraGeometrica();
		FiguraGeometrica figuras[]=new FiguraGeometrica[4];
		figuras[0]=new Cuadrado(4.5);
		figuras[1]=new Cuadrado(2.2);
        figuras[2]=new Circulo(3.5);
        figuras[3]=new Circulo(4);
		double stotal=0;
		int nfiguras=0;
		for (FiguraGeometrica areas:figuras){
			stotal+=areas.superficie();
			nfiguras++;
		}
		System.out.printf("Tenemos un total de %d figuras y su area total es de %.2f unidades\n",nfiguras,stotal);
	}
}
