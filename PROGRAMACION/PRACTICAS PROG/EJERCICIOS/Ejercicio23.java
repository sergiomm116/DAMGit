//~ Una empresa que se dedica a la venta de desinfectantes necesita un programa para hacer facturas. 
//~ En cada factura debe figurar el codigo del articulo, la cantidad en litros y el precio por litro. 
//~ Se pide tras introducir los productos a facturar, generar las facturas y el total de litros vendidos. 
//~ Asi como el numero de facturas cuyo importe sea mayor de 600€

import java.util.Scanner;
public class Ejercicio23 {
	
	public static void main (String[] args) {
		Scanner input=new Scanner (System.in);
		String nombre="abc";
		int litros=0;
		double precio=0;
		while (nombre=="")
			System.out.println("Introduce el nombre del producto: ");
			nombre = input.nextLine();
			System.out.println("Introduce la cantidad de litros: ");
			litros= input.nextInt();
			System.out.println("Introduce el precio por litro: ");
			precio= input.nextDouble();
			
			
		
	}
}

