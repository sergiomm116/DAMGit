import javax.swing.JOptionPane;
public class Ejercicio7 {
	
	public static void main (String[] args) {

		int mes=Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero del mes"));
		int anio=Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero del a\u00f1o"));
		int dias=0;
		
		switch (mes) {
			case 4:
			case 6:
			case 9:
			case 11:dias=30;
				break;
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:dias=31;
				break;
			case 2:
				if(anio%4==0&&anio%100!=0||anio%400==0) {
					dias=29;
				} else {
					dias=28;
					
				}
				break;
			default: System.out.println("No es un numero de mes correcto");
				
		}
		if(mes>=1&&mes<=12) {
		System.out.println("El mes "+mes+" del a\u00f1o "+anio+" tiene "+dias+" dias.");
		}
	}
}

