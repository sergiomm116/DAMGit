import java.util.Scanner;
public class Ejercicio2R {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[64];
        int totalP = 0;
        int totalI = 0;
        int pares = 0;
        int impares = 0;
        System.out.println("Introduce numeros. Introduce el 0 para parar.");
        for(int i = 0; i < 256;i++){
            arr[i] = input.nextInt();
            if(arr[i] == 0){
                for (int j = 0; j < i;j++){
                }
                break;
            }else{
                if(arr[i]%2==0){
                    totalP += arr[i];
                    pares++;
                }else{
                    totalI += arr[i];
                    impares++;
                }
            }
        }
        if(impares != 0){
            System.out.println("Numeros impares: "+impares+"\nMedia impares: "+totalI/impares+"\n");
        }else{
            System.out.println("No se han introducido numeros impares.\n");
        }
        if(pares != 0){
            System.out.println("Numeros pares: "+pares+"\nMedia pares: "+totalP/pares);
        }else{
            System.out.println("No se han introducido numeros pares.");
        }
    }
}
