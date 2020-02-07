public class Ejercicio4 {
	public static void main (String[] args) {
		int a = (int) (Math.random()*26+97);
		boolean vocal = a==97 || a==101 || a==105 || a==111 || a==107;
		System.out.println("La letra "+(char)a+" es vocal: "+vocal);
	}
}

