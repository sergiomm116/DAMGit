import java.util.Scanner;
import java.util.Arrays;
class Contrasena {
    private String pwd;

    public Contrasena (){
        char[] abc = new char[61];
        int l = 65;
        for(int i = 0; i < 26; i++){
            abc[i]= (char)l;
            l++;
        }
        l = 97;
        for(int i = 26; i < 52; i++){

            abc[i]= (char)l;
            l++;
        }
        l = 49;
        for(int i = 52; i < 61; i++){
            abc[i]= (char)l;
            l++;
        }


        char[] aux = new char[8];
        for(int i = 0; i < aux.length;i++){
            aux[i] = (char)abc[(int)(Math.random()*60-1)];
        }

        this.pwd = Arrays.toString(aux);

    }

    public boolean fuerteoDebil (){
        boolean fuerte = false;
        int mayus = 0;
        int minus = 0;
        int num = 0;
        for(int i = 0;i<pwd.length();i++){
            if(pwd.charAt(i) >= 65 && pwd.charAt(i) <= 90){
                mayus++;
            }
            if(pwd.charAt(i) >= 97 && pwd.charAt(i) <= 122){
                minus++;
            }
            if(pwd.charAt(i) >= 49 && pwd.charAt(i) <= 57){
                num++;
            }
        }
        if(mayus >= 1 && minus >= 1 && num >= 3){
            fuerte = true;
        }
        return fuerte;
    }
    public String getPwd (){
        return pwd;
    }
}

public class Ejercicio10R {
    public static void main(String[] args) {

        Contrasena pwd1 = new Contrasena();
        Contrasena pwd2 = new Contrasena();
        Contrasena pwd3 = new Contrasena();
        System.out.println("Contraseña: "+pwd1.getPwd()+" "+pwd1.fuerteoDebil());
        System.out.println("Contraseña: "+pwd2.getPwd()+" "+pwd2.fuerteoDebil());
        System.out.println("Contraseña: "+pwd3.getPwd()+" "+pwd3.fuerteoDebil());

    }
}