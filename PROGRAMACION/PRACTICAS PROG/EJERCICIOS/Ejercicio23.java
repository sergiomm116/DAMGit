//~ Una empresa que se dedica a la venta de desinfectantes necesita un programa para hacer facturas. 
//~ En cada factura debe figurar el nombre del articulo, la cantidad en litros y el precio por litro. 
//~ Se pide tras introducir los productos a facturar, generar las facturas y el total de litros vendidos. 
//~ Asi como el numero de facturas cuyo importe sea mayor de 600€

import java.util.Scanner;
public class Ejercicio23 {
	
	public static void main (String[] args) {
		Scanner input=new Scanner (System.in);
		
		String nombre="";
		double litros=0;
		double precio=0;
		double preciototal=0;
		double litrostotal=0;
		int mayor=0;
		
		System.out.println("Introduce el nombre del producto(introduce 0 para parar); ");
		nombre = input.nextLine();
		
		String stop="0";
		boolean parar=(nombre.equals(stop));
		
		if (parar!=true){
		
			System.out.println("Introduce la cantidad de litros: ");
			litros= input.nextDouble();
			System.out.println("Introduce el precio por litro: ");
			precio= input.nextDouble();
			preciototal=precio*litros;
			System.out.println(litros+" L "+nombre+" N "+precio+" e ");
				if (totalprecio<=600){
					mayor++;
		}else{
			
		
	}
}

