import java.util.Scanner;
public class Ejercicio1R {
    public static void main (String [ ] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduce el primer numero: ");
        int n1 = input.nextInt();
        System.out.print("Introduce el segundo numero: ");
        int n2 = input.nextInt();
        System.out.print("Introduce el tercer numero: ");
        int n3 = input.nextInt();
        int aux;
        if(n1<n3){
            aux = n1;
            n1 = n3;
            n3 = aux;
        }
        if (n2<n3) {
            aux = n2;
            n2 = n3;
            n3 = aux;
        }
        if (n1<n2) {
            aux = n2;
            n2 = n1;
            n1 = aux;
        }
        System.out.println();
        System.out.println(n1+" "+n2+" "+n3);
    }
}