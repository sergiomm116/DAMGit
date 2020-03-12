//4.- Clases internas anonimas
//Veamos un ejemplo, que suele ser el uso mas habitual
//de este tipo de clases internas
import javax.swing.*;
interface Escribible{
	void escribir(String texto);
}
public class ClasesInternasTest9{
	public static void main(String args[]){
		int i;
		Escribible msg=new Escribible(){//Objeto de tipo Escribible, implementando el Metodo escribir()
										//para escribir por pantalla
			public void escribir(String texto){
				System.out.println(texto);
			}
		};//Ojo!!! al ;
		Escribible msg2=new Escribible(){//... y de otra manera diferente, aqui para escribir en un cuadro de dialogo
			public void escribir(String texto){
				JOptionPane.showMessageDialog(null,texto);
			}
		};//Ojo!!! al ;
		do{
			i=Integer.parseInt(JOptionPane.showInputDialog("1) Escribir en la consola\n"+"2) Escribir en un cuadro de dialogo\n"+"3) Salir"));
			switch (i){
				case 1:{
					msg.escribir("Hola");
					break;
					}
				case 2:{
					msg2.escribir("Hola");
					break;
					}
			}
		}while(i!=3);
	}
}
