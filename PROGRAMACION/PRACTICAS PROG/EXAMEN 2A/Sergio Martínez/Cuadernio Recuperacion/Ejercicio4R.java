import java.util.Scanner;
public class Ejercicio4R {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduce el total de numeros: ");
        int[] arr = new int[input.nextInt()];
        System.out.println("Introduce los numeros de uno en uno: ");
        for(int i = 0; i < arr.length; i+=2) {
            arr[i] = input.nextInt();
        }
        for(int i = arr.length-2; i > 0; i-=2) {
            arr[i] = input.nextInt();
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
