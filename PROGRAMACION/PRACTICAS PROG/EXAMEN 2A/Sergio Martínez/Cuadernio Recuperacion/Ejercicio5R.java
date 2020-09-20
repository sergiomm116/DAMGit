import java.util.Scanner;
public class Ejercicio5R {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce 10 numeros de uno en uno.");
        int[] arr = new int[10];
        for(int i = 0; i < arr.length;i++){
            arr[i] = input.nextInt();
        }
        for(int i: arr){
            System.out.print(i+" ");
        }
        System.out.println();
        int aux = arr[arr.length-1];
        for(int i = arr.length-1; i > 0;i--){
            arr[i] = arr[i-1];
        }
        arr[0] = aux;
        for(int i: arr){
            System.out.print(i+" ");
        }
    }
}
