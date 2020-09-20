import java.util.Scanner;
public class Ejercicio3R {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Tienes 5 intentos para adivinar un numero aleatorio del 1 al 20.");
        int x = (int)(Math.random()*20+1);
        int n;
        for(int i = 0;i<5;i++){
            n = input.nextInt();
            if(x != n){
                if(x < n){
                    System.out.println("Menos");
                }else{
                    System.out.println("Mas");
                }
            }else{
                System.out.println("Acierto!");
                break;
            }
        }
    }
}
