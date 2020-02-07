
//3. Crea una clase donde dado un importe en euros introducido por teclado 
 //nos indique o devuelva el numero de billetes necesarios de cada clase de billete y la cantidad sobrante

import javax.swing.JOptionPane;
public class Ejercicio3Otro {
	
	public static void main (String[] args) {
		//Con clase JOptionPane del paquete javax.swing
		String num=JOptionPane.showInputDialog("Introduce importe");
		int numero = Integer.parseInt(num);
		System.out.println("El importe inicial es: " + numero);
		int quinientos=numero/500;
		System.out.println("Billetes de 500--"+quinientos);
		numero%=500;
		int doscientos=numero/200;
		System.out.println("Billetes de 200--" + doscientos);
		numero%=200;
		int cien=numero/100;
		System.out.println("Billetes de 100--" + cien);
		numero%=100;		
		int cincuenta=numero/50;
		System.out.println("Billetes de 50--" + cincuenta);
		numero%=50;
		int veinte=numero/20;
		System.out.println("Billetes de 20--" + veinte);
		numero%=20;
		int diez=numero/10;
		System.out.println("Billetes de 10--" + diez);
		numero%=10;
		int cinco=numero/5;
		System.out.println("Billetes de 5--" + cinco);
		numero%=5;
		System.out.println("El sobrante es " + numero);
	}
}

