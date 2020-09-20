public class Ejercicio8R {
    public static int primitiva(int[] jugados, int[] premiados) {
        int aciertos = 0;
        for(int i = 0; i < jugados.length; i++){
            for(int j = 0; j < premiados.length; j++){
                if(jugados[i] == premiados[j]){
                    aciertos++;
                }
            }
        }
        return aciertos;
    }
    public static void main(String[] args) {
        int[] jugados = new int[5];
        int[] premiados = new int[5];
        for (int i = 0; i < jugados.length; i++) {
            jugados[i] = (int)(Math.random()*100)+1;
        }
        for (int i = 0; i < premiados.length; i++) {
            premiados[i] = (int)(Math.random()*100)+1;
        }
        System.out.println("Numero de aciertos: "+primitiva(jugados,premiados));
        for(int i:jugados){
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i:premiados){
            System.out.print(i+" ");
        }
    }
}
