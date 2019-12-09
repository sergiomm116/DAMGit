//Verificacion de un email
import java.util.Scanner;
public class Matches2 {
 
    public static void main(String[] args) {
 
        String email;
        boolean emailCorrecto;
        Scanner teclado=new Scanner(System.in);
        do{
			System.out.print("Introduce un email: ");
			email=teclado.nextLine();
            emailCorrecto=email.matches("\\w.*@\\w.*[.]\\w.+");
        }while(!emailCorrecto);
 
        System.out.println("El email "+email+" es correcto");
    }
}
