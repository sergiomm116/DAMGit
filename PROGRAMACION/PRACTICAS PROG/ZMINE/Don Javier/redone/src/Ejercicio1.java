public class Ejercicio1 {

    public static void main (String[] args) {

        int i = 1;
        int j = 2;
        int aux;

        System.out.println("Variable i = "+i+" Variable j = "+j);

        aux = i;
        i = j;
        j = aux;

        System.out.println("Variable i = "+i+" Variable j = "+j);

    }
}
