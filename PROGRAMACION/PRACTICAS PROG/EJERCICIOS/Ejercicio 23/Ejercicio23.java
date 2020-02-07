//~ Una empresa que se dedica a la venta de desinfectantes necesita un programa para hacer facturas. 
//~ En cada factura debe figurar el nombre del articulo, la cantidad en litros y el precio por litro. 
//~ Se pide tras introducir los productos a facturar, generar las facturas y el total de litros vendidos. 
//~ Asi como el numero de facturas cuyo importe sea mayor de 600€

import java.util.Scanner;
public class Ejercicio23 {
	
	public static void main (String[] args) {
		Scanner input=new Scanner (System.in);
		
		String nombre="a";
		int c_litros=0;
		int c_600=0;
		int litros=0;
		int precio=0;
		
		
		System.out.print("Nombre: ");
		nombre=input.nextLine();
		
		System.out.print("Litros: ");
		litros=input.nextInt();
		
		System.out.print("Precio por litro: ");
		precio=input.nextInt();
		
		System.out.println("Producto: "+nombre);
		System.out.println("Litros: "+litros);
		System.out.println("Precio por litro: "+precio);
		System.out.println("Precio total: "+litros*precio);
		
		
		if((precio*litros)>=600){
			c_600=c_600+1;
		}
		
		System.out.println("Pedidos superiores a 600e: "+c_600);
	}
}

