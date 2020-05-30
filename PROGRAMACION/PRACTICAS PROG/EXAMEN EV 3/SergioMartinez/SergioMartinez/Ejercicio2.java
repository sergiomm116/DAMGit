import java.util.Scanner;

class Buzon {
	
	Email[] mails;
	
	public int numeroDeEmails() {
		int num = 0;
		
		for (Email mail : mails) {
			if (mails != null){
				num++;
			}
		}
			
		return num;
	}
	
	public void anade(Email c) {
		
		int i = 0;
		boolean ocupado = true;
			while(ocupado != true && i < mails.length){
				if(mails[i]==null){
					mails[i]= c;
					ocupado = true;
				}
			i++;
			}
			
	}
	
	public boolean porLeer() {
		
		boolean leer = false;
			for (Email mail : mails) {
				leer = mail.leidoGet();
				if (mail.leidoGet() == true){
					return leer;
				}
			}
			
		return leer;
	}
	
	public String muestraPrimerNoLeido() {
		String msg = "";
		return msg;
	}
	
	public String muestra(int k) {
		String msg = "";
		return msg;
		
	}
	
	public void elimina (int k) {
		
	}
	
}
class Email {
	
	private String mensaje;
	private boolean leido;
	
	public Email (String mensaje, boolean leido){
		this.mensaje = mensaje;
		this.leido = leido;
	}
	
	public String mensajeGet(){
		return mensaje;
	}
	
	public boolean leidoGet(){
		return leido;
	}
	
}

public class Ejercicio2 {
	
	public static void main (String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		Buzon buzon = new Buzon();
		String mensaje;
		boolean leido;
                        
		for(int i = 0; i < 4; i++){
			System.out.print("Contenido del mensaje: ");
			mensaje = input.nextLine();
			System.out.print("Ha sido leido? (true/false)");
			leido = input.nextBoolean();
			input.nextLine();
			buzon.anade(new Email(mensaje, leido));
			
		}
		
		System.out.println("Numero de mails: "+buzon.numeroDeEmails());
		
		if(buzon.porLeer() == true){
			System.out.println("Quedan emails por leer.");
		}else{
			System.out.println("No quedan emails por leer.");
		}
		
	}
}

