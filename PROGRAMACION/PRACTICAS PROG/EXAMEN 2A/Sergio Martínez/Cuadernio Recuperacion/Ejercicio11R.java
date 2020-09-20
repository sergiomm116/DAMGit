final class Matematicas {

    static public double maximo (double[] arr){
        double n = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > n){
                n = arr[i];
            }
        }
        return n;
    }
    static public double minimo (double[] arr){
        double n = 10;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < n){
                n = arr[i];
            }
        }
        return n;
    }
    static public double sumatorio (double[] arr){
        double n = 0;
        for(int i = 0; i < arr.length; i++){
            n += arr[i];
        }
        return n;
    }
    static public double media (double[] arr){
        double n = sumatorio(arr)/arr.length;
        return n;
    }
}


public class Ejercicio11R {
    public static void main(String[] args) {
        double[] arr = new double[10];
        for(int i = 0; i < arr.length; i++){
            arr[i] = Math.random()*10;
        }

        for(double i : arr){
            System.out.println(i);
        }
        System.out.println("Maximo: "+Matematicas.maximo(arr));
        System.out.println("Minimo: "+Matematicas.minimo(arr));
        System.out.println("Sumatorio: "+Matematicas.sumatorio(arr));
        System.out.println("Media: "+Matematicas.media(arr));
    }
}
