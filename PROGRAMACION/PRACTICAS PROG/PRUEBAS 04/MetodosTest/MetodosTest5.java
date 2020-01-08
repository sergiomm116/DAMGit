//Sobrecarga de Metodos
public class MetodosTest5 {
	static int v1=7,v2=3,v3=4;
	public static void main (String args[]){
		System.out.printf("v1=%d, v2=%d, v3=%d\n",v1,v2,v3);
		System.out.println("El mayor de v2 y v3 es "+mayor(v2,v3));
		System.out.println("El mayor de v1, v2 y v3 es "+mayor(v1,v2,v3));
	}
	static int mayor(int n1,int n2){
		return (n1>n2)?n1:n2;
	}
	static int mayor(int n1,int n2,int n3){
		return (mayor(n1,n2)>n3)?mayor(n1,n2):n3;
	}
}
