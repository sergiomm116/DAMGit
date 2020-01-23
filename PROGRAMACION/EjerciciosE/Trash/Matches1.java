public class Matches1 {
 
    public static void main(String[] args) {
 
        String cadena="Solo se que no se nada";
 
        //Ejemplo1: false, ya que la cadena tiene mas caracteres
        System.out.println("Ejemplo1: "+cadena.matches("Solo"));
 
        //Ejemplo2: true, comienza por Solo y tiene mas caracteres despues
        System.out.println("Ejemplo2: "+cadena.matches("Solo.*"));
 
        //Ejemplo3: true, contiene uno de los caracteres
        System.out.println("Ejemplo3: "+cadena.matches(".*[qnd].*"));
 
        //Ejemplo3: false, ya que ninguno de esos caracteres estan
        System.out.println("Ejemplo4: "+cadena.matches(".*[xyz].*"));
 
        //Ejemplo4: true, ya que le indicamos que no contenga esos caracteres
        System.out.println("Ejemplo4: "+cadena.matches(".*[^xyz].*"));
 
        //Ejemplo5: true, el caracter que antecede a ? puede aparecer una o ninguna veces
        System.out.println("Ejemplo5: "+cadena.matches("S.?lo se qu?e no se na?da"));
 
        //Ejemplo6: false, ya que el texto comienza por S
        System.out.println("Ejemplo6: "+cadena.matches("[a-z].*"));
 
        //Ejemplo7: true, ya que el texto comienza por S
        System.out.println("Ejemplo7: "+cadena.matches("[A-Z].*"));
 
        String cadena2="abc1234";
 
        //Ejemplo8: true, comienza por a y despues puede o no haber mas caracteres
        System.out.println("Ejemplo8: "+cadena2.matches("[abc]+.*"));
 
        //Ejemplo9: true, comienza por a y despues se repite un valor numerico 4 veces
        System.out.println("Ejemplo9: "+cadena2.matches("[abc]+\\d{4}"));
 
        //Ejemplo10: true, comienza por a y despues se repite un valor numerico entre 1 y 10 veces
        System.out.println("Ejemplo10: "+cadena2.matches("[abc]+\\d{1,10}"));
    }
}
