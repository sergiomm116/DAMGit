/*
una clase que pida por teclado 3 numeros enteros y los muestre por pantalla y los muestre de menor a mayor
 */
import javax.swing.JOptionPane;

public class ejer5 {
	
	public static void main (String[] args) {
		int num1=Integer.parseInt(JOptionPane.showInputDialog("introduce un numero"));
		int num2=Integer.parseInt(JOptionPane.showInputDialog("introduce un numero"));
		int num3=Integer.parseInt(JOptionPane.showInputDialog("introduce un numero"));
		
		if(num1<=num2 && num1<=num3 && num2<=num3){
			System.out.println("los numeros ordenados de menor a mayor serian:"+num1+","+num2+","+num3);
			}
		else if(num2<=num1 && num2<=num3 && num1<=num3){
			System.out.println("los numeros ordenados de menor a mayor serian:"+num2+","+num1+","+num3);
			}
		else if(num2<=num1 && num2<=num3 && num1>=num3){
			System.out.println("los numeros ordenados de menor a mayor serian:"+num2+","+num3+","+num1);
			}
		else if(num1>=num2 && num1>=num3 && num2>=num3){
			System.out.println("los numeros ordenados de menor a mayor serian:"+num3+","+num2+","+num1);
			}
		else if(num2>=num1 && num2>=num3 && num1>=num3){
			System.out.println("los numeros ordenados de menor a mayor serian:"+num3+","+num1+","+num2);
			}
		else if(num2>=num1 && num2>=num3 && num1<=num3){
			System.out.println("los numeros ordenados de menor a mayor serian:"+num1+","+num3+","+num2);
			}
	}
}

