public class Ejercicio7R {
    public static int enteroaBinario(int n) {
        String binario = "";
        while (n >= 2) {
            binario = n % 2 + binario;
            n /= 2;
        }
        binario = n + binario;
        return Integer.parseInt(binario);
    }
}